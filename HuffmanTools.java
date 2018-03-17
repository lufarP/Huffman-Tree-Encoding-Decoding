import java.text.CharacterIterator;
import java.util.HashMap;
import java.util.PriorityQueue;



public class HuffmanTools
{
	private static void setFrequencyOfEachSymbol(CharacterIterator symbols,HashMap<Character, Integer> data)
		{
			
			/*
			 * get the frequency of each symbol and store it in hashtable data
			 */
			for(char symbol=symbols.first();symbol!=CharacterIterator.DONE;symbol=symbols.next())
				{
					symbol=symbols.current();
					if(data.containsKey(symbol))
						data.put(symbol, data.get(symbol)+1);
					else
						data.put(symbol, 1);
				}
		}
	public static HuffmanTree buildHuffmanTree(CharacterIterator symbols)
		{
			/*
			 *  The iterator "symbols" will provide a sequence of Character objects.
			 *    These are used to construct a Huffman Tree, which is returned by the method.
			 */
			
			HashMap<Character, Integer> data = new HashMap<Character,Integer>();
			setFrequencyOfEachSymbol(symbols, data);
			
			
			HashMap<HuffmanTree, Integer> huffmanData = new HashMap<HuffmanTree,Integer>();;
			
			PriorityQueue<HuffmanTree> minHeap = new PriorityQueue<>((a,b)-> {
				return huffmanData.get(a)-huffmanData.get(b);
			});
			
			HuffmanTree node=null;
			for(Character c:data.keySet())
				{
					node = new HuffmanLeaf(c,data.get(c));
					huffmanData.put(node, data.get(c));
					minHeap.add(node);
				}
			data.clear();
			
			
			HuffmanTree left,right;
			while(minHeap.size()>1)
				{
					right = minHeap.poll();
					left = minHeap.poll();
					node = new HuffmanInternalNode(left, right);
					huffmanData.put(node, huffmanData.get(left)+huffmanData.get(right));
					minHeap.add(node);
				}
			return minHeap.poll();
			
		}
	public static boolean searchAndEncode(HuffmanTree tree,char symbol,StringBuilder answer)
		{
			if (tree instanceof HuffmanLeaf)
				{
					if(((HuffmanLeaf)tree).getData()==symbol)
						{	
							return true;
						}
					else
						{
							answer.deleteCharAt(answer.length()-1);
							return false;
						}
				}
			else
				{
					boolean found= searchAndEncode(((HuffmanInternalNode)tree).getLeft(), symbol, answer.append(0))
							||searchAndEncode(((HuffmanInternalNode)tree).getRight(), symbol, answer.append(1));
					if(found)
						return true;
					else
						{
							answer.deleteCharAt(answer.length()-1);
							return false;
						}
				}
		}
	public static String encode(HuffmanTree tree,CharacterIterator symbols)
		{
			StringBuilder answer=new StringBuilder();
			for(char symbol=symbols.first();symbol!=CharacterIterator.DONE;symbol=symbols.next())
				searchAndEncode(tree, symbol, answer);
			return answer.toString();
		}
	
	public static String decode(HuffmanTree tree,CharacterIterator symbols)
		{
			StringBuilder answer=new StringBuilder();
			HuffmanTree current=tree;
			for(char symbol=symbols.first();symbol!=CharacterIterator.DONE;symbol=symbols.next())
				{
					
					if(symbol=='1')
						current=((HuffmanInternalNode)current).getRight();
					else
						current=((HuffmanInternalNode)current).getLeft();
					
					if(current instanceof HuffmanLeaf)
						{
							answer.append(((HuffmanLeaf) current).getData().toString());
							current=tree;
						}
				}
			return answer.toString();
		}
}

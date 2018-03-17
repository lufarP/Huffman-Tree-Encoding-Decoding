
public class Solution
	{
		public static void main(String[] args)
			{
				String a,s,d;
				 s="eebbeecdebeeebecceeeddebbbeceedebeeddeeeecceeeedeeedeeebeedeceedebeeedeceeedebee";
				HuffmanTree tree=HuffmanTools.buildHuffmanTree(InternalTools.getCharacterIteratorFromString(s));
				 a="11010111";
				 d=HuffmanTools.decode(tree,InternalTools.getCharacterIteratorFromString(a) );
				 System.out.println(d);	
				a=HuffmanTools.encode(tree,InternalTools.getCharacterIteratorFromString(d) );
				System.out.println(a);
				
			}
		
	}

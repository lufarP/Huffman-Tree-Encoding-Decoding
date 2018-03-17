
public class HuffmanInternalNode implements HuffmanTree
{
	private HuffmanTree left;
	private HuffmanTree right;
	
	public HuffmanInternalNode(HuffmanTree left,HuffmanTree right)
		{
			this.setLeft(left);
			this.setRight(right);
		}

	public HuffmanTree getLeft()
		{
				return left;
		}

	public void setLeft(HuffmanTree left)
		{
				this.left = left;
		}

	public HuffmanTree getRight()
		{
				return right;
		}

	public void setRight(HuffmanTree right)
		{
				this.right = right;
		}		
}

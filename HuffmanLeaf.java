
public class HuffmanLeaf implements HuffmanTree
	{
		private Character data;
		private int count;
		public HuffmanLeaf(Character data,int count)
			{
				this.setData(data);
				this.setCount(count);
			}
		public Character getData()
			{
					return data;
			}
		public void setData(Character data)
			{
					this.data = data;
			}
		public int getCount()
			{
					return count;
			}
		public void setCount(int count)
			{
					this.count = count;
			}
		@Override
		public String toString()
		{
			// TODO Auto-generated method stub
			return "[Character ="+data.charValue()+", Count ="+count+"]";
		}
		
	}

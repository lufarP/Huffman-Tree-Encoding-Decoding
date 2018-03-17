import java.text.StringCharacterIterator;

public class InternalTools
{
	public static StringCharacterIterator getCharacterIteratorFromString(String s)
		{
			return new StringCharacterIterator(s) ;
			
		}
	public static StringCharacterIterator getCharacterIteratorFromString(String s,int f[])
		{

			StringBuilder answer=new StringBuilder();
			int frequency;
			int size=s.length();
			for(int i=0;i<size;i++)
				{
					frequency=f[i];
					while(frequency-->0)
						{
							answer.append(s.charAt(i));
						}
				}
			return getCharacterIteratorFromString(answer.toString());
		}
	public static StringCharacterIterator getCharacterIteratorFromString(HashMap<Character,Integer> s)
		{
			StringBuilder answer=new StringBuilder();
			int frequency;
			for(char c:s.keySet())
				{
					frequency=s.get(c);
					while(frequency-->0)
						{
							answer.append(c);
						}
				}
			return getCharacterIteratorFromString(answer.toString());
		}
	

	
	public static StringCharacterIterator getCharacterIteratorFromFile(String fileName)
		{
//			
//			// This will reference one line at a time
//			String line = null;
//			
//			try {
//				// FileReader reads text files in the default encoding.
//				FileReader fileReader = 
//						new FileReader(fileName);
//				
//				// Always wrap FileReader in BufferedReader.
//				BufferedReader bufferedReader = 
//						new BufferedReader(fileReader);
//				
//				while((line = bufferedReader.readLine()) != null) {
//					System.out.println(line);
//				}   
//				
//				// Always close files.
//				bufferedReader.close();         
//			}
//			catch(FileNotFoundException ex) {
//				throw new FileNotFoundException(
//						"Unable to open file '" + 
//								fileName + "'");                
//			}
//			catch(IOException ex) {
//				throw new IOException(
//						"Error reading file '" 
//								+ fileName + "'");                  
//				// Or we could just do this: 
//				// ex.printStackTrace();
				
				return null;	
			
		}
}
			
		

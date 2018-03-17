import java.text.StringCharacterIterator;

public class InternalTools
{
	public static StringCharacterIterator getCharacterIteratorFromString(String s)
		{
			return new StringCharacterIterator(s) ;
			
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
			
		

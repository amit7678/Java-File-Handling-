import java.io.*;
class ReadDataFromFile {

	public static void main(String args[]) {

		// Define the path for the new file to write
		try {
			FileReader f=new FileReader("F:\\File_Handling\\file.text");
			try {
				int i;
				while((i=f.read())!=-1)
				{
					System.out.print((char)i+" ");
				}
			}

			finally {
			     // Ensure the FileReader is closed after reading
				f.close();
			}
		}
		catch(Exception e)
		{
			 // Handle any exceptions, such as file not found or access issues
			System.out.println("Exception handled" +e.getMessage());

		}
	}
}
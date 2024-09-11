import java.io.*;
class CopyOneFileToAnotherFile {

	public static void main(String args[]) {

		// Define the path for the new file to write
		try {
			FileInputStream r=new 	FileInputStream("F:\\File_Handling\\amit.text");
			FileOutputStream w=new FileOutputStream("F:\\File_Handling\\java.text");
			int i;
			while((i=r.read())!=-1)
			{
				w.write((char)i);
			}

			System.out.println("Data copied successfully ");
		} catch (FileNotFoundException e) {
			// Handle case where file paths are invalid or files do not exist
			System.out.println("File not found: " + e.getMessage());
		} catch (IOException e) {
			// Handle general I/O errors
			System.out.println("I/O error: " + e.getMessage());
		}



	}
}
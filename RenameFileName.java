import java.io.*;
class RenameFileName{

	public static void main(String args[]) {

		// Define the path for the new file to write

		File f=new File("F:\\File_Handling\\file.text");
		File f2=new File("F:\\File_Handling\\amit.text");

		if(f.exists())
		{
			f.renameTo(f2);
		} else {
			System.out.println("file doesn't exists");
		}


	}
}
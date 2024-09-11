import java.io.*;
class CreateFile {

	public static void main(String args[]) {
	    
	     // Define the path for the new file
	  	File f=new File("F:\\File_Handling\\file.text");
		try {
		     // Attempt to create a new file at the specified path
			if(f.createNewFile())
			{
			     // If the file was successfully created, notify the user
				System.out.println("File has been created");
			} else {
			      // If the file already exists, notify the user
				System.out.println("File already exists");
			}
		}
		catch( IOException e)
		{
		    // Handle IOExceptions invalid path
			System.out.println("Exception handled" +e.getMessage());

		}
	}
}
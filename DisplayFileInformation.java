import java.io.*;
class DisplayFileInformation{

	public static void main(String args[]) {
	    
	     // Define the path for the new file
	  	File f=new File("F:\\File_Handling\\file.text");
		try {
		   	if(f.exists())
			{
			   	System.out.println("File name:"+f.getName());
				System.out.println("File location:"+f.getAbsolutePath());
				System.out.println("Is this file writable ?"+f.canWrite());
				System.out.println("Is this file Readable ?"+f.canRead());
				System.out.println("Fetch the length of file"+f.length());
			} else {
			 	System.out.println("File doesnot exists");
			}
		}
		catch(Exception e)
		{
		    // Handle Exceptions invalid path
			System.out.println("Exception handled" +e.getMessage());

		}
	}
}
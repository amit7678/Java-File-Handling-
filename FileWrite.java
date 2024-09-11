import java.io.*;
class FileWrite {

	public static void main(String args[]) {
	    
	     // Define the path for the new file to write
	     try {
	  	FileWriter f=new FileWriter("F:\\File_Handling\\file.text");
	
		   try
			{
			   f.write("this is a java language");
			   } 
			   finally{
			       f.close();
			   }
			   System.out.println("write operation performed successfully");
			}
		
		catch(Exception e)
		{
		    // Handle IOExceptions invalid path
			System.out.println("Exception handled" +e.getMessage());

		}
	}
}
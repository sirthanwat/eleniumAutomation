package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

//using throws we are declaring the exception
//we can declare more than one exception 
//parent of all the class exception is 'Exception'
//Can throws only with checked exceptions 
//it is in method level

public class Throws {
		public void excep() throws FileNotFoundException 
	{
		File f =new File("");
		//Identify by the complier in compile time 
		FileReader fr = new FileReader(f);//Unhandled exception type FileNotFoundException

	}
	
	public void excep1() throws FileNotFoundException, Exception
	{
		File f =new File("");
		//Identify by the complier in compile time 
		FileReader fr = new FileReader(f);//Unhandled exception type FileNotFoundException

	}

	public static void main(String[] args) {

	}

}

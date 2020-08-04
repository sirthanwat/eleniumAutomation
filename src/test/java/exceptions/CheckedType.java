package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

//That is occour in complite time called checked exception
public class CheckedType {
	
	public void checkedEx() throws FileNotFoundException //using throws we are declaring the exception
	{
		File f =new File("");
		//Identify by the complier in compile time 
		FileReader fr = new FileReader(f);//Unhandled exception type FileNotFoundException

	}

	public static void main(String[] args) {

	}

}

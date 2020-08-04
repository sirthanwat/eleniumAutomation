package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

// for try we need to write catch or finally block
//if exection will occur in try then control we go in catch
//more then one catch block we can write 

public class TryCatch1 {

	//if we want to handle diff type of exception using only one catch the need to use 'Exception'
	public void tryMultiCatch() {
		try {
			File f = new File("./test.txt");
			FileReader fr = new FileReader(f);
			System.out.println("operation..." +5/0);
			System.out.println("Pass");
		} catch (Exception e) {
	          System.out.println("Catch Exception");

		}
		//It is already handled by the catch block for Exception 
		//we cant use catch block after using catch with 'Exception'
		/*catch (ArithmeticException e) {
	          System.out.println("Catch ArithmeticException");

		}*/
        System.out.println("Pass...in try");
	}
	
	public void tryMultiCatch1() {
		try {
			File f = new File("./test.txt");
			FileReader fr = new FileReader(f);
			System.out.println("operation..." +5/0);
			System.out.println("Pass");
		}
		////befor parent 'Exception' catch we can use any catch block
		catch (ArithmeticException e) { //It is already handled by the catch block for Exception
	          System.out.println("Catch ArithmeticException");

		}catch (Exception e) {
	          System.out.println("Catch Exception");

		}		
        System.out.println("Pass...in try");
	}

	public static void main(String[] args) {
		TryCatch1 tc = new TryCatch1();
		tc.tryMultiCatch();

	}

}

package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

// for try we need to write catch or finally block
//if exection will occur in try then control we go in catch
//more then one catch block we can write 

public class TryCatch {

	public void trySingalCatch() {
		try {
			File f = new File("./test.txt");
			FileReader fr = new FileReader(f);
			System.out.println("Pass");
		} catch (FileNotFoundException e) {
	          System.out.println("Catch");

		}
        System.out.println("Pass...in try");
	}
	
	public void tryMultiCatch() {
		try {
			File f = new File("./test.txt");
			FileReader fr = new FileReader(f);
			System.out.println("operation..." +5/0);
			System.out.println("Pass");
		} catch (FileNotFoundException e) {
	          System.out.println("Catch FileNotFoundException");

		}
		catch (ArithmeticException e) {
	          System.out.println("Catch ArithmeticException");

		}
        System.out.println("Pass...in try");
	}

	public static void main(String[] args) {
		TryCatch tc = new TryCatch();
		tc.trySingalCatch();
		tc.tryMultiCatch();

	}

}

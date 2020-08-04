package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

// for try we need to write catch or finally block
//if exection will occur in try then control we go in catch
//more then one catch block we can write 

public class TryCatchFinally {

	/*
	 * if case of checked exception catch is mandatory to write
	 */

	public void tryCatchBlock() {
		try {
			File f = new File("./test.txt");
			FileReader fr = new FileReader(f);
			System.out.println("operation..." + 5 / 0);
			System.out.println("Pass");
		} catch (Exception e) {
			System.out.println("Catch Exception");

		} finally {
			System.out.println("finally...");

		}
		System.out.println("Pass...in try");
	}
	/*
	 * if case of un checked exception catch is not mandatory , we can handle
	 * exception using finally block
	 */

	public void tryBlock() {
		try {

			System.out.println("operation..." + 5 / 0);
			System.out.println("Pass");
		} finally {
			System.out.println("finally...in ");
		}
	}

	public static void main(String[] args) {
		TryCatchFinally tc = new TryCatchFinally();
		tc.tryBlock();
	}

}

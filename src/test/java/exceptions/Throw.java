package exceptions;


// for try we need to write catch or finally block
//if exection will occur in try then control we go in catch
//more then one catch block we can write 

public class Throw {

	// For manually throw an exception in any condition
	// need to place inside the method body
	// only one exception can throw at a time
	//need to pass the object of exception class
	
	public void throwBlock(int i) throws RunTimeException {
		if (i < 10){
			throw (new ArithmeticException()); //need to pass the object of exception class
		}
		if (i > 10){
			throw (new RunTimeException()); 
		}
	}

	public static void main(String[] args) throws RunTimeException {
		Throw tc = new Throw();
		tc.throwBlock(11);

	}

}

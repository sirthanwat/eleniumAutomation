package exceptions;


//That is occour in run time called unchecked exception
public class UnCheckedType {
	
	public void unCheckedEx()
	{
		int i =2, j=0; 
		System.out.print(i/j);  //java.lang.ArithmeticException
	}

	public static void main(String[] args) {
		UnCheckedType ue = new UnCheckedType();
		ue.unCheckedEx();
	}
}

package debugging;

import org.testng.annotations.Test;

/*
 * process to find out opint of error
if dev or tester fix that error its call bug fixing.
pause the execution on particular line is called the breakpoint
options for performing debugging :
step into (f5)
step over (f6)
step out (f7)
*/

public class Debug0 {

	@Test
	public void testDebug() {
        int a = 100;  //pausing line here for debugging
        int b= 0;
        int c = a/b;  //getting bug here
        System.out.println(c);
        System.out.println("Error");       		
	}
	/*
	 * if we have 1000 of code and want to exact line of exception occur then use ExceptionBreakpoint
	 * NO need of mark toggle breakpoint
	 * 
	 * steps : 
	 * go in debug perspective
	 * go in breakpoint show view (right hand side)
	 * click on add java exception breakpoint
	 * type the exception name in search box and click ok 
	 * exception will add in it
	 * */
	public void exceptionBreakpoint() {
        int a = 100;  //pausing line here for debugging
        int b= 0;
        int c = a/b;  //getting bug here
        System.out.println(c);
        System.out.println("Error");       		
	}

	public static void main(String[] args) {
		Debug0 bug = new Debug0();
		//bug.testDebug();
		bug.exceptionBreakpoint();
	}
}

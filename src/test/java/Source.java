

public class Source extends Thread {

	public void run() 
    { 
        try
        {
            System.out.println ("Thread " + Thread.currentThread().getId() + " is running");
        } 
        catch (Exception e) 
        {
            System.out.println ("Exception is caught"); 
        } 
    } 
	public static void main(String arg[])
	{
		for (int i=0; i<=3; i++) 
        {
			Source object = new Source(); 
            object.start(); 
        } 
	}
}



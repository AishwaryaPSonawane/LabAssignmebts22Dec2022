//3.create a thread to find number is odd or even 

package exceptions;



public class NewThread {
	public static void main(String args[])		//main is by default system thread
	{
		MyThread M=new MyThread();
		
		M.start();		//start method is used to call run method
		
		
	}
}

class MyThread  extends Thread 	//creating new over thread
{
	public void run()		//override read method
	{
		int Num=13;
		if(Num%2==0)
		{
			System.out.println("Num is Even");
		}
		else
		{
			System.out.println("Num is Odd");
		}
	 
	} 

}

/*
 * Write down program where you take input 2 numbers from the user and divide the first number with second .
 * Include exception handling mechanism.
 */

package exceptions;

import java.util.Scanner;

public class TryCatchException 
{
	public static void main(String args[])
	{
		int FirstNum,SecondNum;
		int result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First number: ");	//take input from user
		FirstNum=sc.nextInt();
		System.out.println("Enter the Second number: ");	//take input from user
		SecondNum=sc.nextInt();
		
		try			
		{
			 result =FirstNum/SecondNum;		//may throw the exception
		}
		catch(Exception e)		//exception handing code 
		{
			System.out.println(e);
		}	
		//printing result if exception is not occurs 
		result =FirstNum/SecondNum;		
		System.out.println("End Result "+result);
	
	}

}

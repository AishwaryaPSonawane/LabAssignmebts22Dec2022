/*
 * 1.Write a program take the input of age from user if the age is above 18 print 'You are eligible 
 * to vote ' else throw an exception that 'age is not correct'. 
 */

package exceptions;


import java.util.Scanner;

public class ThrowException 
{
	public static void main(String args[])
	{
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age you want to check");	//take input from user
		age=sc.nextInt();
		
		if(age>=18)		//check person eligible 
		{
			System.out.println("Person is eligible for voting  ");
		}
		else	//throw exception if person is not valid
		{
			throw new ArithmeticException("Perosn is not eligible for excetion");
		}
		
	
	}

}

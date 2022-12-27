//1.Write program take 2 strings as input from the user and find if both the Strings are same or not 
package Strings;

import java.util.Scanner;

public class StringsEquals {
	public static void main(String args[])
	{
		Scanner S = new Scanner(System.in);
		
		System.out.println("Enter the First String:");
		String str1= S.nextLine();
	
		
		System.out.println("Enter the Second String:");
		String str2= S.nextLine();
		if(str1.equals(str2)==true)
		{
			System.out.println("Strings are Equals");
		}
		else
		{
			System.out.println("Strings are not Equlas");
		}
	}	


}

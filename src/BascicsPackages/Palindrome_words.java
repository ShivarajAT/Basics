package BascicsPackages;

import java.util.*;

public class Palindrome_words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter a String:");
		String str = Sc.nextLine();
		
		String rev = "";
		int Lenghth = str.length();
		
		for(int i=Lenghth-1;i>=0; i--)
		{
			
			rev= rev + str.charAt(i);
			
		}
		if(str.equals(rev))
		{
			System.out.print("Entered " + str +" is Palindrome string");
		}
		else
		{
			System.out.print("Entered " + str +"is not Palindrome string");
		}
		}
}

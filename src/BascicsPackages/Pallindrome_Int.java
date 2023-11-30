package BascicsPackages;

import java.util.Scanner;

public class Pallindrome_Int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number");
		int num= sc.nextInt();
		
		int rem;
		int rev = 0;
	    int n= num;
		while(num>0)
		{
			rem=num%10;
			rev=(rev*10)+rem;		
			num=num/10;
			
	}	
		if(n==rev)
		{
			System.out.println("Enter number is pallindrome");
		}
		else
		{System.out.println("Enter number is not pallindrome");
			
		}
		
	}
	
	}



package BascicsPackages;

import java.util.*;

public class Perfect_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        
	        int i=1, sum=0;
	        
          while(i<number)
        	  
          {
        	  if(number%i==0)
        	  {
        		sum=sum+i;  
        	  }
	        i++;
          }
	       if(number==sum)
	    	   
	    	   
	       {
	    	   System.out.println("Enter number is a perfect number");
	       }
	       else {
	    	   System.out.println("Enter number is not a perfect number");
	       }
	}
	
	

}

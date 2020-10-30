package day4_hcl_Assgn;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int no=-1;
      boolean isOdd=false;
      do {
    	  System.out.println("Please enter a number or enter ‘-1’ if you want to quit");
    	  Scanner sc=new Scanner(System.in);
    	  
    	  try {
    	  no=sc.nextInt();
    	  
    	  isOdd=checkOddNo(no);
    	  
    		  
    	
    	  if(no>0&&no<=100) {
    	  if(isOdd) {
    		  System.out.println("You have entered an odd number");
    	  }
    	  else {
    		  System.out.println("You have entered an even number");
    	  }
    	  }
    	  
    	  else if(no>100) {
    		    throw new ArithmeticException("Number can’t be greater than 100");
    		  }
      
    	  
    	  else {
    		  System.out.println("You must enter an integer");
    	  }
    	  }catch(InputMismatchException e) {
    		  System.out.println("You must enter an integer");
    		  
    	  }
    	  
      }while(no!=-1);
		
		
	}

	private static boolean checkOddNo(int no) {
		// TODO Auto-generated method stub
		return no%2!=0;
	}

}

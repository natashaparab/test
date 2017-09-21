package com.jpmorgan.banking.Java_app;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "enter the string to heck" );
    	
    	String input = "";
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a string to check if it is a palindrome");
        input = in.nextLine();
        
        isPalindrome(input);
    }
    
    public static boolean isPalindrome(String input) {
    	
    	String reverse ="";
    	
    	//if(!input.equals(null)))
    	
    	int length = input.length();
    	for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + input.charAt(i);
    	
    	if (input.equals(reverse))
    	{
    		System.out.println("true");
            return true;
    	}
    	else
    	{
    		System.out.println("false");
            return false;
    	}
         
    	
            //return false;
    }
    
}

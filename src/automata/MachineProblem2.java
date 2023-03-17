package automata;
import java.util.Scanner;

public class MachineProblem2 {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // take input for the two strings
	        System.out.print("Input string 1: ");
	        String string1 = sc.nextLine();
	        System.out.print("Input string 2: ");
	        String string2 = sc.nextLine();

	        // determine the length of the strings
	        int len1 = string1.length();
	        int len2 = string2.length();

	        // create palindrome versions of the strings
	        String palindrome1 = new StringBuilder(string1).reverse().toString();
	        String palindrome2 = new StringBuilder(string2).reverse().toString();

	        // concatenate the strings
	        String concatenation1 = string1 + string2;
	        String concatenation2 = string2 + string1;
	        	
	        //is the reverse of aba a palindrome
	        
	        
	        
	        // check if palindrome is true
	        if(string1.equals(palindrome1)) {
	        	System.out.println("String 1 is a palindrome.");
	        }
	        else {
	        	System.out.println("String 1 is not a palindrome.");
	        }
	        if(string2.equals(palindrome2)) {
	        	System.out.println("String 2 is a palindrome.\n");
	        }
	        else {
	        	System.out.println("String 2 is not a palindrome.\n");
	        }

	        // display the results
	        System.out.println("The length of string 1 "+ string1 + " is: " + len1);
	        System.out.println("The length of string 2 "+ string2 + " is: " + len2);
	        System.out.println("The reverse of the string1 " + string1 + " is: " + palindrome1);
	        System.out.println("The reverse of the string2 "+ string2 + " is: " + palindrome2);
	        System.out.println("The concatenation of string 1 and 2 is: " + concatenation1);
	        System.out.println("The concatenation of string 2 and 1 is: " + concatenation2);
	        
	        
	        
	        
	        
	        sc.close();
	    }
	}

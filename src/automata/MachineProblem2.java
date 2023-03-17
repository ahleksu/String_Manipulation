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

	        // display the results
	        System.out.println("The length of the first string "+ string1 + " is: " + len1);
	        System.out.println("The length of the second string "+ string2 + " is: " + len2);
	        System.out.println("The palindrome of the first string" + string1 + " is: " + palindrome1);
	        System.out.println("The palindrome of the second string"+ string2 + " is: " + palindrome2);
	        System.out.println("The concatenation of string 1 and 2 is: " + concatenation1);
	        System.out.println("The concatenation of string 2 and 1 is: " + concatenation2);

	        sc.close();
	    }
	}

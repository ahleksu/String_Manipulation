package automata;
import java.util.Scanner;

public class MachineProblem2 {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // take input for the two strings
	        System.out.print("Enter the first string: ");
	        String string1 = sc.nextLine();
	        System.out.print("Enter the second string: ");
	        String string2 = sc.nextLine();

	        // determine the length of the strings
	        int len1 = string1.length();
	        int len2 = string2.length();

	        // create palindrome versions of the strings
	        String palindrome1 = string1 + new StringBuilder(string1).reverse().toString();
	        String palindrome2 = string2 + new StringBuilder(string2).reverse().toString();

	        // concatenate the strings
	        String concatenation = string1 + string2;

	        // display the results
	        System.out.println("The length of the first string is: " + len1);
	        System.out.println("The length of the second string is: " + len2);
	        System.out.println("The palindrome of the first string is: " + palindrome1);
	        System.out.println("The palindrome of the second string is: " + palindrome2);
	        System.out.println("The concatenation of the two strings is: " + concatenation);

	        sc.close();
	    }
	}

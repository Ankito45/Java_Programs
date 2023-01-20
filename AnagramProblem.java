package corejava;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramProblem {
/*
 * An Anagram is a word or phrase that made by transposing the letter of two words or phrase
 * like "Parliament" is anagram of "partial men" and also "software" is a anagram of "Swear oft" 
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the frst string : ");
		String s1 = sc.nextLine();
		System.out.print("Enter the second string :");
		String s2 = sc.nextLine();
		if(s1.length()== s2.length()) {
			char[] arr1 = s1.toCharArray();
			char[] arr2 = s2.toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			boolean Result = Arrays.equals(arr1, arr2);
			if(Result) {
				System.out.println("The two String "+ s1 + " and " + s2 + " are anagrams");
			}
			else {
				System.out.println("The two String "+ s1 + " and " + s2 + " are not anagrams");
			}
		}
		else {
			System.out.println("The two String "+ s1 + " and " + s2 + " are not anagrams");
		}
	}
}

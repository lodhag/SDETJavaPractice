//Write a Java program to reverse a string without using built-in methods.
package javapractice;

public class ReverseString {
	public static void main(String[] Args) {
		/*
		 * //1st Approach String s = "Hello World"; String r = ""; for (int i =
		 * s.length() - 1; i >= 0; i--) { r = r + s.charAt(i); } System.out.println(r);
		 */
		// 2nd Approach - using the String Builder
		String s = "Reverse";
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		System.out.println(sb);
	}
}



import java.util.Scanner;

public class PalindromeOnly {
	public static boolean isPalindrome(String str) {
		String rev = ;
		for (int i = str.length() - 1; i = 0; i--) {
			rev += str.charAt(i);
		}
		System.out.println(rev);
		if (rev.equalsIgnoreCase(str)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(Enter the String );
		String str = scanner.next();
		boolean check = isPalindrome(str);
		if (check == true) {
			System.out.println(It is a Pallindrome);
		} else {
			System.out.println(It is Not a Pallindrome);
		}
		scanner.close();
	}

}

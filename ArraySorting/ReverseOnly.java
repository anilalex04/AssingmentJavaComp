
import java.util.Scanner;

public class ReverseOnly {
	public static String reverseStr(String str) {
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		return rev;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = scanner.next();
		System.out.println("The reverse of the String is : "+reverseStr(str));
		scanner.close();
	}


}

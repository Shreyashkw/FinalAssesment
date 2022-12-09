package javaAssesment;
import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = s.next();
		int count = 0;
		String vow = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				vow += str.charAt(i);
				count++;

			}
		}
		if (count > 0) {
			System.out.println("Entered String "+str + " contains vowels : " + vow);
		} else
			System.out.println("Entered String "+str + " does not contains vowels");
		
		s.close();
	}
}

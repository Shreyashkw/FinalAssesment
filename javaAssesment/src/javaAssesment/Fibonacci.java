package javaAssesment;

public class Fibonacci {

	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1;
		int n3 , count = 10;
		System.out.print(n1+" "+n2);
		for(int i=2;i<count;++i) {
			n3 = n2+n1;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}

}

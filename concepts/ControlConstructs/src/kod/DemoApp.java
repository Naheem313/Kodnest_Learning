package kod;

import java.util.Scanner;

public class DemoApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int marks=scan.nextInt();
		System.out.println("welcome to kodnest");
		
		Demo mark = new Demo();
		int a =  mark.res( marks);
		System.out.println(a);
		
		
	}

}

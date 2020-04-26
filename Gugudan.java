package ku.opensrcsw;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int dan;
		System.out.println("v1.0");
		System.out.println("단을 입력하세요: ");
		dan = in.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " X " + i + " = " + dan*i);
		}

	}

}
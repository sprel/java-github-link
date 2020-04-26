package ku.opensrcsw;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int dan;
		System.out.println("v1.5");
		System.out.println("0을 입력하면, 2단부터 9단까지의 구구단을 출력합니다.: ");
		dan = in.nextInt();

		if (dan == 0) {
			for (int i = 1; i <= 9; i++) {
				for (int j = 2; j <= 9; j++) {
					if (10 <= i*j)
						System.out.print(j + " X " + i + " = " + j*i + "   ");
					else
						System.out.print(j + " X " + i + " = " + j*i + "    ");
				}
				System.out.println();
			}
		}

	}

}
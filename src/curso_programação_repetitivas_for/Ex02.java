package curso_programação_repetitivas_for;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0, in = 0, out = 0;
		
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			x = sc.nextInt();
			if(x >= 10 && x <= 20) {
				in += 1;
			}else {
				out += 1;
			}
		}
		System.out.println(in + " in");
		System.out.println(out + " Out");
		
		sc.close();
	}

}

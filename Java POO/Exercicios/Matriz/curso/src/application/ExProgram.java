package application;

import java.util.Scanner;

public class ExProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Integer n = sc.nextInt();
		Integer j = sc.nextInt();
		
		Integer[][] mat = new Integer[n][j];
		
		for(Integer i = 0; i < mat.length; i++ ) {
			for(Integer f = 0; f < mat[i].length; f++) {
				mat[i][f] = sc.nextInt();
			}
		}
		
		Integer o = sc.nextInt();
		
		for(Integer i = 0; i < mat.length; i++ ) {
			for(Integer f = 0; f < mat[i].length; f++) {
				if(o == mat[i][f]) {
					System.out.println("Posição: " + i +","+ f + ":");
					if(f > 0) {
						System.out.println("Left: " + mat[i][f-1]);
					}
					if(f < mat[i].length-1){
						System.out.println("Right: " + mat[i][f+1]);
					}
					if(i > 0) {
						System.out.println("Up: " + mat[i-1][f]);
					} 
					if(i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][f]);
					}				
				}
			}
		}
		
		sc.close();
	}
}

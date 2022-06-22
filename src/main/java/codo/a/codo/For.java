package codo.a.codo;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		
		/*los primeros N numero, donde N es leido por teclado*/
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese N");
		
		//leer N
		int n = teclado.nextInt();
		
		for(int i=0;i<=n ;i++ ) {
			System.out.println(i);
		}
	}

}

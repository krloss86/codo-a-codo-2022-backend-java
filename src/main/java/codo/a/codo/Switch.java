package codo.a.codo;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		//leer la nota desde teclado
		//const variable = prompt('algo')
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese nota");
		
		int nota = teclado.nextInt();
		
		switch (nota) {
			case 7:
				System.out.println("aprobado");
				break;
			case 10:
				System.out.println("excelente");
				break;
			default:
				System.out.println("nose");
				break;
		}
		
		//cierro el teclado
		teclado.close();
	}

}

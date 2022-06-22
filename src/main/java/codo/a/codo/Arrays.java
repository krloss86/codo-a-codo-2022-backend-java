package codo.a.codo;

public class Arrays {

	public static void main(String[] args) {
		
		//const array = [];
		int[] array = new int[4];// 0 - 2
		
		array[0] = 10;
		array[1] = 11;
		array[2] = 12;
		array[3] = 13;//ERROR
		
		System.out.println("FIN");
		
		//recorer el array de enteros??
		
		for(int i=0; i < array.length;i++) {
			System.out.println(array[i]);
		}
		
		//quiero mostrar solo el indice 3
		System.out.println("Mostrando valor del indice3: " + array[3]);

		//recorrer el array usando un foreach 
		for(int aux : array) {
			System.out.println(aux);
		}
	}
 
}

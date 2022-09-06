package codo.a.codo;

public class While {

	public static void main(String[] args) {
		
		int contador = 10;
		
		while(contador >= 0) {
			System.out.println("contador:" + contador);
			
			if(contador % 2 == 0) {//par o impar
				System.out.println(contador + "par");
			}else {
				System.out.println(contador + "impar");
			}
			
			contador--;			
		}

	}
	/*
	11 |_5__
     1  2
    */	
}

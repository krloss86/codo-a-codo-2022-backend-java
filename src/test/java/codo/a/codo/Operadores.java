package codo.a.codo;

public class Operadores {

	public static void main(String[] args) {
		/*
		 * aritméticos
		 */
		
		/*
		 * +,-,/,*
		*/
		
		//relacionales
		
		/* >, < , != >=, <= 
		 */
		
		//lógicos NECESITAN DOS VALORES
		//AND OR NOT
		//&&, ||  !
		
		String usuario = "root1";//.next()
		String contrasenia = "root";
		
		if("root".equals(usuario) && "root".equals(contrasenia)) {
			System.out.println("OK");
		}else {
			System.out.println("FAIL");
		}
	}

}

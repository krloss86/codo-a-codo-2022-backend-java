package oop;

public class FabricaDeAutos {

	public static void main(String[] args) {

		Auto fiatUno = new Auto(300f,"AUTO",new Motor("motor",300f));
		
		fiatUno.encender();
		fiatUno.verVelocidad();//0
		
		fiatUno.acelerar();
		fiatUno.verVelocidad();//1
		
		fiatUno.acelerar();
		fiatUno.verVelocidad();//2
		
		fiatUno.acelerar();
		fiatUno.verVelocidad();//3
		//fiatUno.acelerar();
		
		System.out.println("frenando");
		fiatUno.frenar();
		fiatUno.verVelocidad();//2
		
		fiatUno.apagar();
		fiatUno.verVelocidad();//0
		
		System.out.println("fin");
	}

}

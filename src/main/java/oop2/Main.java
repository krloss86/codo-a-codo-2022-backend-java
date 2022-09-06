package oop2;

import oop.Auto;
import oop.Estereo;
import oop.Motor;

public class Main {

	public static void main(String[] args) {
		
		//composicion
		Motor motorDesdeAFuera = new Motor("MCLAREN",150F);		
		Auto auto = new Auto(220f,"RENAULT",motorDesdeAFuera);
		
		//asociacion
		Estereo e = new Estereo();		 
		auto.setEstereo(e);
	}
}

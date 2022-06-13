package oop;

//nombre de clase
public class Auto {
	
	//atributos de la clase
	String color;
	int anio; 
	long serie;
	String marca;
	String modelo;
	float velocidad;
	float velocidadMaxima;
	boolean encedido;
	
	//cundo nace el objeto: constructor 
	Auto() {
		velocidad = 0;
		anio = 2022;
		marca = "SIN MARCA";
		modelo = "SIN MODELO";
		encedido = false;
		velocidadMaxima = 3;
	}
	
	//metodos
	void encender() {
		if(!encedido) {
			encedido = true;
			System.out.println("Se ha encendio el auto");
		}else {
			System.out.println("No se puede encender dos veces");
		}
	}

	
	
	void acelerar() {
		//if(encendido == true)
		if(encedido) {
			if(velocidad < velocidadMaxima) {
				velocidad++ ;
			}else{
				System.out.println("Error: no puede superar la velocidad maxima");
			}
		}else {
			System.out.println("Error: debe encender el auto");
		}
	}
	
	void frenar() {
		if(encedido) {
			if(velocidad > 0) { 
				velocidad--;	
			}
		}else {
			System.out.println("Error: auto apagado");
		}
	}
	
	void verVelocidad() {
		System.out.println(velocidad);
	}
	
	void apagar() {
		if(encedido) {
			
			while(velocidad > 0) {
				frenar();
			}
			
			encedido = false;
			System.out.println("Se ha apagado correctamente");
		}else {
			System.out.println("No se puede apagar dos veces");
		}
	}
}

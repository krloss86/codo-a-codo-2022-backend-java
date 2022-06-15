package oop;

//nombre de clase
public class Auto {
	
	//atributos de la clase, deben ser privados
	private String color;
	private int anio; 
	private long serie;
	private String marca;
	private String modelo;
	private float velocidad;
	private float velocidadMaxima;
	private boolean encedido;
	
	private Motor motor;
	private Estereo estereo;
	
	//cundo nace el objeto: constructor 
	public Auto(float velociadadMaxima,String marca, Motor motor) {
		this.setVelocidadMaxima(velociadadMaxima);				
		this.setVelocidad(0);
		this.setAnio(2022);
		this.setEncedido(false);
		this.setMarca(marca);
		this.setMotor(motor);
	}
	
	public void setMotor(Motor motor) {
		if(motor == null) {
			Motor motorInterno = new Motor("default",100f);
			this.motor = motorInterno;
		}else {
			this.motor = motor;
		}
	}
	
	public Motor getMotor() {
		return this.motor;
	}
	
	public void setEstereo(Estereo nuevoEstereo) {
		if(nuevoEstereo != null) 
			this.estereo = nuevoEstereo;
	}

	
	//metodos
	public void encender() {
		if(!this.isEncedido()) {
			this.setEncedido(true);			
			System.out.println("Se ha encendio el auto");
		}else {
			System.out.println("No se puede encender dos veces");
		}
	}
	
	
	public void acelerar() {
		if(this.isEncedido()) {
			if(this.getVelocidad() < this.getVelocidadMaxima()) {
				this.setVelocidad(this.getVelocidad() + 1);
			}else{
				System.out.println("Error: no puede superar la velocidad maxima");
			}
		}else {
			System.out.println("Error: debe encender el auto");
		}
	}
	
	public void frenar() {
		if(this.isEncedido()) {
			if(this.getVelocidad() > 0) { 
				this.setVelocidad(this.getVelocidad() - 1);
			}
		}else {
			System.out.println("Error: auto apagado");
		}
	}
	
	public void verVelocidad() {
		System.out.println(velocidad);
	}
	
	public void apagar() {
		if(this.isEncedido()) { 
			while(this.getVelocidad() > 0) {
				frenar();
			}
			
			this.setEncedido(false);
			
			System.out.println("Se ha apagado correctamente");
		}else {
			System.out.println("No se puede apagar dos veces");
		}
	}
	
	public String getMarca() {
		return marca == null ? "" : marca;
	}
	
	public void setMarca(String marca) {
		if(marca != null) {
			this.marca = marca;
		}else {
			this.marca = "";
		}			
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAnio() {
		return anio;
	}

	private void setAnio(int anio) {
		this.anio = anio;
	}

	public long getSerie() {
		return serie;
	}

	private void setSerie(long serie) {
		this.serie = serie;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getVelocidad() {
		return velocidad;
	}

	private void setVelocidad(float velocidad) {
		if(velocidad < 0) {
			this.velocidad = 0;
		}else {
			this.velocidad = velocidad;
		}
	}

	public float getVelocidadMaxima() {
		return velocidadMaxima;
	}

	private void setVelocidadMaxima(float velocidadMaxima) {
		if(velocidadMaxima < 0 || velocidadMaxima > 220) {
			if(velocidadMaxima < 0)
				this.velocidadMaxima = 0;
			if(velocidadMaxima > 220)
				this.velocidadMaxima = 220;
		}else {
			this.velocidadMaxima = velocidadMaxima;
		}
	}

	public boolean isEncedido() {
		return encedido;
	}

	private void setEncedido(boolean encedido) {
		this.encedido = encedido;
	}
	
	//alt+shit+s
	
}

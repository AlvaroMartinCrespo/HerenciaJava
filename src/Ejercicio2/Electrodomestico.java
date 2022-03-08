package Ejercicio2;

public class Electrodomestico {

//	Constantes 

	protected final static double PRECIOBASE_DEF = 100;
	protected final static double PESO_DEF = 5;
	protected final static String COLOR_DEF = "Blanco";
	protected final static char CONSUMOENERGETICO_DEF = 'F';

//	Atributos

	protected double precioBase;
	protected double peso;
	protected char consumoEnergetico;
	protected String color;

//	Constructores

	public Electrodomestico(double precioBase, double peso, char consumoEnergetico, String color) {

		this.precioBase = precioBase;
		this.peso = peso;
		comprobarConsumoEnergetico(consumoEnergetico);
		comprobarColor(color);

	}

	public Electrodomestico(double precioBase, double peso) {

		this(precioBase, peso, CONSUMOENERGETICO_DEF, COLOR_DEF);

	}

	public Electrodomestico() {

		this(PRECIOBASE_DEF, PESO_DEF, CONSUMOENERGETICO_DEF, COLOR_DEF);

	}

	public double getPrecioBase() {
		return precioBase;
	}

	public double getPeso() {
		return peso;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public String getColor() {
		return color;
	}

	private void comprobarConsumoEnergetico(char consumoEnergetico) {


		
		if(consumoEnergetico=='A') {
			
			this.consumoEnergetico=consumoEnergetico;
			
		}else if(consumoEnergetico=='B') {
			
			this.consumoEnergetico=consumoEnergetico;
			
		}else if(consumoEnergetico=='C') {
			
			this.consumoEnergetico=consumoEnergetico;
			
		}else if(consumoEnergetico=='D') {
			
			this.consumoEnergetico=consumoEnergetico;
			
		}else if(consumoEnergetico=='E') {
			
			this.consumoEnergetico=consumoEnergetico;
			
		}else if(consumoEnergetico=='F') {
			
			this.consumoEnergetico=consumoEnergetico;
			
		}else {
		
			this.consumoEnergetico=CONSUMOENERGETICO_DEF;
			
		}

	}

	private void comprobarColor(String color) {

		boolean comprobar = false;

		String[] colores = { "blanco", "negro", "rojo", "azul", "gris" };

		for (int i = 0; i < colores.length; i++) {

			if (color.equalsIgnoreCase(colores[i])) {

				comprobar = true;

			}

		}

		if (comprobar) {
			this.color = color;
		} else {
			this.color = COLOR_DEF;
		}

	}
	
	public double precioFinal() {
		
		double precioFinal=0;
		
		if(consumoEnergetico=='A') {
			
			precioFinal+=100;
			
		}else if(consumoEnergetico=='B') {
			
			precioFinal+=80;
			
		}else if(consumoEnergetico=='C') {
			
			precioFinal+=60;
			
		}else if(consumoEnergetico=='D') {
			
			precioFinal+=50;

		}else if(consumoEnergetico=='E') {
			
			precioFinal+=30;
			
		}else if(consumoEnergetico=='F') {
			
			precioFinal+=10;
			
		}
		
		if(peso>=0 && peso<=19) {
			
			precioFinal+=10;
			
		}else if(peso>=20 && peso<=49) {
			
			precioFinal+=50;
			
		}else if(peso>=50 && peso<=79) {
			
			precioFinal+=80;
			
		}else if(peso>=80) {
		
			precioFinal+=100;
			
		}
		
		return precioFinal;
		
		
	}

}

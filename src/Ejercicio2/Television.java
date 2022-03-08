package Ejercicio2;

public class Television extends Electrodomestico {

//	Constantes
	private final static int PULGADA_DEF = 20;
	private final static boolean SINTONIZADORTDT_DEF = false;
	private final static double PORCENTAJE=1.3;

//	Atributos

	private int pulgada;
	private boolean sintonizadortdt;

//	Constructores

	public Television(double precioBase, double peso, String color, char consumoEnergetico, int pulgada,
			boolean sintonizadortdt) {

		super(precioBase, peso, consumoEnergetico, color);

		this.pulgada = pulgada;
		this.sintonizadortdt = sintonizadortdt;

	}

	public Television(double precioBase, double peso) {

		this(precioBase, peso, COLOR_DEF, CONSUMOENERGETICO_DEF, PULGADA_DEF, SINTONIZADORTDT_DEF);

	}

	public Television() {

		this(PRECIOBASE_DEF, PESO_DEF, COLOR_DEF, CONSUMOENERGETICO_DEF, PULGADA_DEF, SINTONIZADORTDT_DEF);

	}

	public int getPulgada() {
		return pulgada;
	}

	public boolean isSintonizadortdt() {
		return sintonizadortdt;
	}
	
	public double precioFinal() {
		
		double precioFinal=0;
		
		precioFinal+=super.precioFinal();
		
		if(this.pulgada>40) {
			
			precioFinal=precioFinal*PORCENTAJE;
			
		}
		
		if(this.sintonizadortdt) {
			
			precioFinal+=50;
			
		}
		
		return precioFinal;
		
	}

}

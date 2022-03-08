package Ejercicio2;

public class Lavadora extends Electrodomestico {

//	Constantes

	private final static int CARGA_DEF = 5;

//	Atributos

	private int carga;

//	Constructores

	public Lavadora(double precioBase, double peso, char consumoEnergetico, String color, int carga) {

		super(precioBase, peso, consumoEnergetico, color);

		this.carga = carga;

	}

	public Lavadora(double precioBase, double peso) {

		this(precioBase, peso, CONSUMOENERGETICO_DEF, COLOR_DEF, CARGA_DEF);

	}

	public Lavadora() {

		this(PRECIOBASE_DEF, PESO_DEF, CONSUMOENERGETICO_DEF, COLOR_DEF, CARGA_DEF);

	}

	public int getCarga() {
		return carga;
	}

	public double precioFinal() {

		double precioFinal=0;


		precioFinal = super.precioFinal();

		if (carga > 30) {

			precioFinal += 50;

		}
		
		return precioFinal;

	}

}

package Ejercicio2;

public class Main {

	public static void main(String[] args) {

//		Variables
		
		double precioLavadora = 0;
		double precioTelevision = 0;
		double precioElectrodomestico = 0;

//		Array electrodomesticos
		
		Electrodomestico[] electrodomesticos = new Electrodomestico[10];

//		Instanciamos las clases
		
		Lavadora l1 = new Lavadora();
		Lavadora l2 = new Lavadora();
		Lavadora l4 = new Lavadora();
		
		Electrodomestico e1=new Electrodomestico();
		Electrodomestico e2=new Electrodomestico();
		Electrodomestico e3=new Electrodomestico();
		
		Television t1 = new Television(100, 100);
		Television t2 = new Television(100, 10);
		Television t3 = new Television(20, 40);
		Television t4 = new Television();
		
//		Rellenamos la array
		
		electrodomesticos[0] = l1;
		electrodomesticos[1] = l2;
		electrodomesticos[2] = e3;
		electrodomesticos[3] = l4;
		electrodomesticos[4] = e1;
		electrodomesticos[5] = t1;
		electrodomesticos[6] = t2;
		electrodomesticos[7] = t3;
		electrodomesticos[8] = t4;
		electrodomesticos[9] = e2;
		
//		Recorremos la array
		
		for (int i = 0; i < electrodomesticos.length; i++) {
			
			if (electrodomesticos[i] instanceof Lavadora) {

				precioLavadora += electrodomesticos[i].precioFinal();

			}
			
			if (electrodomesticos[i] instanceof Television) {

				precioTelevision += electrodomesticos[i].precioFinal();

			}

			if (electrodomesticos[i] instanceof Electrodomestico) {

				precioElectrodomestico += electrodomesticos[i].precioFinal();

			}

			

			

		}

		
		System.out.println("Precio lavadora: " + precioLavadora);
		System.out.println("Precio television: " + precioTelevision);
		System.out.println("Precio electrodomestico: " + precioElectrodomestico);

	}

}

package SintonizadorPOO;

import java.util.Scanner;

public class SintonizadorMai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion;
		Scanner lector= new Scanner(System.in);
		SintonizadorFm sintonizarFm=new SintonizadorFm();
		do {
			System.out.println(" *** RADIO FM *** ");
			System.out.println(" 1. SUBIR ");
			System.out.println(" 2. BAJAR ");
			System.out.println(" 3. INDICAR UN FAVORITO ");
			System.out.println(" 4. APAGAR LA RADIO ");
			System.out.println(" INDIQUE SU OPICION->>");
			opcion=lector.nextInt();
		
			switch (opcion) {
			case 1->{
			sintonizarFm.up();
			sintonizarFm.display();
			}
			case 2-> {
			sintonizarFm.down();
			sintonizarFm.display();
			}
			case 3-> {
				System.out.println("indica la Frecuencia Favorita");
				sintonizarFm.setFrecuencia(lector.nextDouble());
				sintonizarFm.display();
			}
			case 4 -> System.out.println("---APAGADO---");
			default->
			System.out.println("Opcion no valida");
			}
		}while(opcion!=4);

	}

}

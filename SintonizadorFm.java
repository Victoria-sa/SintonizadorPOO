package SintonizadorPOO;

import java.security.PublicKey;

public class SintonizadorFm {

	double frecuencia;	
	public SintonizadorFm(double frecuencia) {
		if (frecuencia<80) {
			this.frecuencia=80;
		}else if (frecuencia>80) {
			this.frecuencia=108;
			
		}else {
			this.frecuencia = frecuencia;
		}
		}
		public SintonizadorFm() {
			//this(80;no tiene sentido
			this.frecuencia=80;
				
		}
		public void setFrecuencia(double frecuencia) {
			this.frecuencia = frecuencia;
			comprobarFrecuencia();
		}
		public double down() {
		this.frecuencia	-=0.5;//bajamos la frecuencia en 0.5Mhz
		//debo comprobar que lafrecuencia este entre 80/108
		comprobarFrecuencia();
		return this.frecuencia;	
	}
		public double up () {
			this.frecuencia+=0.5;
			comprobarFrecuencia();
			return this.frecuencia;
		}
		public void display () {
			System.out.println(" Sintonizando "+ this.frecuencia + "Mhz");
		}
		private void comprobarFrecuencia() {//solo puedo acceder al metodo desde la misma clase
			if( this.frecuencia<80) {
				this.frecuencia=108;
				
			}else if (this.frecuencia>108) {
				this.frecuencia=80;
			}
		}
}

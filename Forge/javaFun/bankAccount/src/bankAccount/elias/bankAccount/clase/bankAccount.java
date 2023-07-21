package bankAccount.elias.bankAccount.clase;

import java.util.Random;



public class bankAccount {

	
		private int numeroDeCuenta;
		private double saldoCuentaCorriente;
		private double saldoCuentaAhorros;
		private static int cuentasCreadas = 0;
		private static double rastreo = 0;
		
		//INSTANCIAMOS UN OBJETO RANDOM
		Random rand = new Random();

		//METODOS
		
		public void verTotal() {
	        System.out.println("Total en cuenta corriente: " + this.getSaldoCuentaCorriente());
	        System.out.println("Total en cuenta de ahorros: " + this.getSaldoCuentaAhorros());
	    }
		
		private int crearNumeroDeCuenta() {
		 int numeroCuenta = rand.nextInt(1000000000);
		 return numeroCuenta;
		};
		
		public void depositarEn(boolean cuenta, double dinero) {
			if (cuenta ){
				this.saldoCuentaCorriente += dinero;
				System.out.println("¡Su dinero se ah acreditado con exito! " + this.saldoCuentaCorriente);
			}
			else if(!cuenta)  {
				this.saldoCuentaAhorros += dinero;
				System.out.println("¡Su dinero se ah acreditado con exito! " + this.saldoCuentaAhorros);
			}
		
		}
		
		public void retirarDe(boolean cuenta, double dinero) {
		    if (cuenta) {
		        double saldoActual = this.getSaldoCuentaCorriente();
		        if (saldoActual >= dinero) {
		            this.saldoCuentaCorriente -= dinero;
		        	System.out.println("¡Su dinero se ah retirado con exito! " + this.saldoCuentaAhorros);
		        } else {
		            System.out.println("Saldo insuficiente en la cuenta corriente.");
		        }
		    } else {
		        double saldoActual = this.getSaldoCuentaAhorros();
		        if (saldoActual >= dinero) {
		            this.saldoCuentaAhorros -= dinero;
		        	System.out.println("¡Su dinero se ah retirado con exito! " + this.saldoCuentaAhorros);
		        } else {
		            System.out.println("Saldo insuficiente en la cuenta de ahorros.");
		        }
		    }
		}


		//CONSTRUCTORES
		
		
		
		public bankAccount(double saldoCuentaCorriente, double saldoCuentaAhorros) {
			this.numeroDeCuenta = crearNumeroDeCuenta();;
			this.saldoCuentaCorriente = saldoCuentaCorriente;
			this.saldoCuentaAhorros = saldoCuentaAhorros;
			
			cuentasCreadas++;
			
			rastreo += this.getSaldoCuentaCorriente() + this.getSaldoCuentaAhorros();
		}


	
public void verTotal1() {
			
		}

		//GETTERS AND SETTERS
	

	
		public int getNumeroDeCuenta() {
			return numeroDeCuenta;
		}

		public void setNumeroDeCuenta(int numeroDeCuenta) {
			this.numeroDeCuenta = numeroDeCuenta;
		}

		public Random getRand() {
			return rand;
		}

		public void setRand(Random rand) {
			this.rand = rand;
		}

		public static void setRastreo(double rastreo) {
			bankAccount.rastreo = rastreo;
		}

	
		public double getSaldoCuentaCorriente() {
			return saldoCuentaCorriente;
		}
		public void setSaldoCuentaCorriente(double saldoCuentaCorriente) {
			this.saldoCuentaCorriente = saldoCuentaCorriente;
		}
		public double getSaldoCuentaAhorros() {
			return saldoCuentaAhorros;
		}
		public void setSaldoCuentaAhorros(double saldoCuentaAhorros) {
			this.saldoCuentaAhorros = saldoCuentaAhorros;
		}
		public static int getCuentasCreadas() {
			return cuentasCreadas;
		}
		public static void setCuentasCreadas(int cuentasCreadas) {
			bankAccount.cuentasCreadas = cuentasCreadas;
		}
		public static double getRastreo() {
			return rastreo;
		}
		public static void setRastreo(int rastreo) {
			bankAccount.rastreo = rastreo;
		}

		

		}





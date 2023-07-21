package elias.bankAccountTest.main;

import bankAccount.elias.bankAccount.clase.bankAccount;

public class bankAccountTest {

	public static void main(String[] args) {
		bankAccount cuenta = new bankAccount(0, 0);
		System.out.println(bankAccount.getRastreo());
		
		
		cuenta.depositarEn(false, 500);
		
		System.out.println(cuenta.getSaldoCuentaCorriente());
		System.out.println(cuenta.getSaldoCuentaAhorros());
		System.out.println(cuenta.getNumeroDeCuenta());
		cuenta.retirarDe(false, 700);
		cuenta.retirarDe(false, 250);
		System.out.println(cuenta.getSaldoCuentaCorriente());
		System.out.println(cuenta.getSaldoCuentaAhorros());
		
		System.out.println(bankAccount.getRastreo());
		cuenta.verTotal();
		
		
	}

}
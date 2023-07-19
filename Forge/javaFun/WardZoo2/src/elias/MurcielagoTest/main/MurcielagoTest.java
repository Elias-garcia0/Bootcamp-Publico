package elias.MurcielagoTest.main;

import elias.Murcielago.clase.Murcielago;

public class MurcielagoTest {

	public static void main(String[] args) {
		Murcielago batman = new Murcielago();
		//Nuestro Murcielago ataca una torre 3 veces
		batman.attackTown();
		batman.attackTown();
		batman.attackTown();
		System.out.println(batman.getEnergy()); //Mostramos en pantalla la energia de nuestro Murcielago luego de atacar 3 torres
		//Nuestro Murcielago come 2 humanos
		batman.eatHumans();
		batman.eatHumans();
		System.out.println(batman.getEnergy()); //Mostramos en pantalla la energia de nuestro Murcielago luego de comer 2 personas
		//Nuestro Murcielago sale volando 2 veces
		batman.fly();
		batman.fly();
		System.out.println(batman.getEnergy()); //Mostramos en pantalla la energia de nuestro Murcielago luego de volar 2 veces
	}

}

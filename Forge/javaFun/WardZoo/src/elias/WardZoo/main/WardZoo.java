package elias.WardZoo.main;


import elias.Gorilla.clase.Gorilla;


public class WardZoo {

	public static void main(String[] args) {
		
		Gorilla kingkong = new Gorilla();
		kingkong.displayEnergy(); //Mostramos la energia inicial
		kingkong.throwSomething();// Lanzamos algo 3 veces
		kingkong.throwSomething();
		kingkong.throwSomething();
		kingkong.displayEnergy(); //Mostramos la energia luego de lanzar algo 3 veces
		kingkong.eatBanana();  //Hacemos que coma banana 2 veces
		kingkong.eatBanana();
		kingkong.displayEnergy();//Mostramos su energia luego de comer
		kingkong.climb();	//Hacemos que trepe un arbol
		kingkong.displayEnergy();	//Mostramos su energia luego de trepar el arbol
		
	}

}

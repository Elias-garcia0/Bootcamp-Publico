package elias.Gorilla.clase;

import elias.Mammal.clase.Mammal;

public class Gorilla extends Mammal {
	
	public void throwSomething() {
		System.out.println("El gorilla lanzó un palo a las personas");
		this.getEnergy();
		this.setEnergy(this.getEnergy()-5);
	}

	public void eatBanana() {
		System.out.println("El gorilla come una banana");
		this.getEnergy();
		this.setEnergy(this.getEnergy()+10);
	}

	public void climb() {
		System.out.println("El gorilla trepó a la cima de un arbol");
		this.getEnergy();
		this.setEnergy(this.getEnergy()-10);
	}

	
}



package elias.Murcielago.clase;

import elias.Mamifero.clase.Mamifero;

public class Murcielago extends Mamifero {
	public void fly(){
		System.out.println("Murciélago volando: *e-ko-lo-ka-li-za-ción*");
		this.setEnergy(getEnergy() - 50);
		
	}

	public void eatHumans(){
		System.out.println("bueno, no importa. Ñam ñam");
		this.setEnergy(getEnergy() + 25);
		
	}
	
	public void attackTown(){
		System.out.println("¡Ciudad en llamas! ¡Tss! ¡Tss!");
		this.setEnergy(getEnergy() - 100);
		
	}


}

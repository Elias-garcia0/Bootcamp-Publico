package elias.HumanTest.main;

import elias.Human.clase.Human;
import elias.Ninja.clase.Ninja;
import elias.Samurai.clase.Samurai;
import elias.Wizard.clase.Wizard;

public class HumanTest {

    public static void main(String[] args) {
    	//CREANDO INSTANCIAS
        Samurai samurai = new Samurai("Samurai");
        Ninja ninja = new Ninja ("Ninja");
        Wizard wizard = new Wizard("Mago");
        Human humano = new Human("Humano");
        
        humano.attack(samurai);

        while (humano.getHealth() > 0 ){
        	samurai.attack(humano);
        }
       
    }

}

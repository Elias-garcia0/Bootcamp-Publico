package elias.Human.clase;

public class Human {

	//ESTADISTICAS DE LA CLASE HUMANO
	private String name;
	private int health = 100;
	private int strength = 3;
	private int stealth = 3;
	private int intelligence = 3;
	
	//METODOS
	public void attack(Human objetivo){
	int danio = this.strength;
	objetivo.reduceHealth(danio);
	if (objetivo.health <= 0) {
        System.out.println("¡" + objetivo.name + " ha muerto!");
    } else {
        System.out.println(this.name + " ha atacado a " + objetivo.name + " por " + danio + " puntos de vida. " + objetivo.name + " Ahora tiene " + objetivo.health + " puntos de vida.");
    }
}
	
	
	 public void reduceHealth(int danio) {
	        this.health -= danio;
	    }
	
	//CONSTRUCTOR
	
	  public Human(String name) {
	        this.name = name;
	    }

	//GETTERS AND SETTERS
	


	


	public int getHealth() {
		return health;
	}




	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setHealth(int health) {
		this.health = health;
	}




	public int getStrength() {
		return strength;
	}




	public void setStrength(int strength) {
		this.strength = strength;
	}




	public int getStealth() {
		return stealth;
	}




	public void setStealth(int stealth) {
		this.stealth = stealth;
	}




	public int getIntelligence() {
		return intelligence;
	}




	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}





}

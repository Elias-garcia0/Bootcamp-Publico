package javaClases.elias.clases.clases;
public class Project {
    public String nombre;
    public String descripcion;

    //METODO 
    public void elevatorPitch() {
        System.out.println(nombre + " : " + descripcion);
    }
    
//SOBRECARGA CONSTRUCTORES
    public Project() {
    }


    public Project(String nombre) {
        this.nombre = nombre;
    }

 
    public Project(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    



 
 //GETTERS AND SETTERS
 
 public String getNombre() {
	return nombre;
}



public void setNombre(String nombre) {
	this.nombre = nombre;
}




public String getDescripcion() {
	return descripcion;
}




public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}





 
}

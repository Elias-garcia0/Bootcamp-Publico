
public class StringManipulator {

    //Metodo de la clase para sacar espacios y concatenar dos cadenas
    public String trimAndConcat(String string1, String string2){
        string1 = string1.trim();
        string2 = string2.trim();

        return string1.concat(string2);
    }

    //Metodo para saber el indice de un caracter en una cadena
    public int getIndexOrNull(String cadena, char caracter){
        int index = cadena.indexOf(caracter);

        return index;
    }

    //Metodo para obtener el indice donde empieza la subcadena
    public int getIndexOrNull(String cadena1, String cadena2){
        int index = cadena1.indexOf(cadena2);

        return index;
    }

    //Método para obtener una subcadena utilizando un índice de inicio y un índice de finalización y concatenarlo
    String concatSubstring(String cadena1, int inicio, int finalizacion, String cadena2){
        cadena1 = cadena1.substring(inicio,finalizacion);

        return cadena1 + cadena2;
    }


}
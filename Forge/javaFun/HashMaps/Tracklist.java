import java.util.HashMap;
import java.util.Set;

public class Tracklist {
    public static void main(String[] args) {
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("El poeta dice la verdad", "Quiero llorar mi pena y te lo digo, para que tu me quieras y me llores");
        userMap.put("Yendo a la casa de Damian", "Yendo un weekend a lo de Damian, tenia urgencia de hablar con el man");
        userMap.put("Aventuras y proezas", "Aventuras y proezas de una simple capital, me voy por la ruta de los pirados");
        userMap.put("Maldicion", "Maldicion, otro dia como ayeer, sentado frente a la television");
        // Obtener las claves utilizando el método keySet()
        Set<String> keys = userMap.keySet();
        
        // Iterar sobre las claves y mostrar los valores correspondientes
        for(String key : keys) {
            System.out.println(key);
            System.out.println(userMap.get(key));
        }
    }
}

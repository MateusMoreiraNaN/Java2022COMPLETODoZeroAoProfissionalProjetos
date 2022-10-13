package ArraysECollections.Collections;

import java.util.HashMap;
import java.util.Map;

public class MapMapa {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();

        usuarios.put(1, "Roberto");
        usuarios.put(2, "Mateus");
        usuarios.put(3, "Rafaela");
        usuarios.put(4, "Rebec");

        System.out.println(usuarios.size());
        System.out.println(usuarios);



        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());
        System.out.println(usuarios.containsKey(3));
        System.out.println(usuarios.containsValue("Rafaela"));
        System.out.println(usuarios.containsKey(150));
        System.out.println(usuarios.containsValue("batata"));
        System.out.println(usuarios.remove(1));

        System.out.println("-----------------------");

        for(int chave: usuarios.keySet()){
            System.out.println(chave);
        }

        System.out.println("-----------------------");

        for(String chave: usuarios.values()){
            System.out.println(chave);
        }

        System.out.println("-----------------------");

        for(Map.Entry<Integer, String> registro: usuarios.entrySet()){
            System.out.print(registro.getKey() + " ==> ");
            System.out.print(registro.getValue());
        }
    }
}

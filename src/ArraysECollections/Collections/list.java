package ArraysECollections.Collections;

import java.util.ArrayList;

public class list {
    public static void main(String[] args) {
        ArrayList<usuario> lista = new ArrayList<>();

        usuario u1 = new usuario("Ana");

        lista.add(u1);
        lista.add(new usuario("Carlos"));
        lista.add(new usuario("Lia"));
        lista.add(new usuario("Bia"));
        lista.add(new usuario("Manu"));

        System.out.println(lista.get(3).nome);



        lista.remove(1);
        lista.remove(new usuario("Manu"));

        for(usuario u: lista){
            System.out.println(u.toString());
        }


    }
}

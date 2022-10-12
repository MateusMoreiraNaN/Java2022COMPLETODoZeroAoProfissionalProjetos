package ArraysECollections.Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {

        //Set<String> listaAprovado = new HashSet<String>();
        Set<String> listaAprovado = new TreeSet<String>();
        listaAprovado.add("Ana");
        listaAprovado.add("Carlos");
        listaAprovado.add("Luca");
        listaAprovado.add("Pedro");

        for(String candidato: listaAprovado){
            System.out.println(candidato);
        }

        Set<Integer> nums = new HashSet<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(1914);
        nums.add(6);

        for(int n: nums){
            System.out.println(n);
        }

    }
}

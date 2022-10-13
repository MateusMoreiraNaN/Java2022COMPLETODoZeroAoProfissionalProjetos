package ArraysECollections.Collections;

import ArraysECollections.Usuario;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        HashSet<usuario> usuarios = new HashSet<>();

        usuarios.add(new usuario("Pedro"));
        usuarios.add(new usuario("Ana"));
        usuarios.add(new usuario("Guilherme"));

        boolean resuldado = usuarios.contains(new usuario("Guilherme"));

        System.out.println(resuldado);


    }
}

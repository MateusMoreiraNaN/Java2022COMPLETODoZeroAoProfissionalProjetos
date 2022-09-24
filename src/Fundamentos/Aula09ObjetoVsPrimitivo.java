package Fundamentos;

public class Aula09ObjetoVsPrimitivo {

    public static void main(String[] args) {

        String s = new String("Texto");
        s.toUpperCase();

        // Wrappers são a  versão objeto dos tipos
        // primitivos!
        int a = 123;
        System.out.println(a);
    }
}

package fundamentos;

import java.util.Scanner;

public class Aula20IgualdadeComStrings {
    public static void main(String[] args) {
        System.out.println("2" == "2");

        String s = new String("2");
        System.out.println("2" == s);
        System.out.println("2".equals(s));

        Scanner entradda = new Scanner(System.in);

        String s2 = entradda.next();
        System.out.println(s2);
        // o nextLine não tira os espaços
        System.out.println("2" == s2.trim());
        System.out.println("2".equals(s2.trim()));
        // usar o equals para comparar strings
        //trim tira os espaços
        System.out.println("2".equals(s2));

        entradda.close();
    }
}

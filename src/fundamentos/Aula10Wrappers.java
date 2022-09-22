package fundamentos;

import java.nio.charset.IllegalCharsetNameException;
import java.util.Scanner;

public class Aula10Wrappers {
    public static void main(String[] args) {

        //Scanner entrada = new Scanner(System.in);

        // byte
        Byte b = 100; //byte
        Short s = 1000; //short
        Integer i = 10000; // int
        Integer y = 10000;
                //Integer.parseInt(entrada.next());
        Long l = 100000L;
        Float f = 100.54F;
        Double h = 12345.7845;

        System.out.println(b.byteValue());
        System.out.println(f);
        System.out.println(h);
        System.out.println(s.toString());
        System.out.println(i);
        System.out.println(y + 10);

        Boolean bo = Boolean.parseBoolean("true");

        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

        Character c = '?'; // char
        Character d = ':';

        System.out.println("Qual é seu nome"+c);
        System.out.println("digite sua idade"+d);

        //entrada.close();

    }
}

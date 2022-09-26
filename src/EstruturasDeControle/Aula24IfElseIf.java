package EstruturasDeControle;

import java.util.Locale;
import java.util.Scanner;

public class Aula24IfElseIf {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a nota: ");

        double nota = entrada.nextDouble();

        if(nota > 10 || nota < 0){
            System.out.println("Nota inválida");
        }else if(nota >= 7.0 && nota <= 10){
            System.out.println("A");
        }else if(nota >= 4.0 && nota <= 7.0){
            System.out.println("B");
        }else if(nota >= 0 && nota <= 4.0){
            System.out.println("C");
        }


        System.out.println("Fim!");
        entrada.close();
    }
}

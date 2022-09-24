package EstruturasDeControle;

import java.util.Locale;
import java.util.Scanner;

public class Aula22If {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Scanner entrada = new Scanner(System.in);

        System.out.println("informe a média: ");
        double media = entrada.nextDouble();

        if(media <= 10 && media >= 7.0){
            System.out.println("Aprovado");
            System.out.println("Parabéns");
        }

        if(media < 7 && media >= 4.5){
            System.out.println("Recuperação");
        }

        if(media < 4.5 && media >= 0){
            System.out.println("Reprovado");
        }


        entrada.close();
    }
}

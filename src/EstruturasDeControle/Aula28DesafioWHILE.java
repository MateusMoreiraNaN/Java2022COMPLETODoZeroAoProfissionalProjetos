package EstruturasDeControle;

import java.util.Locale;
import java.util.Scanner;

public class Aula28DesafioWHILE {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Scanner entrada = new Scanner(System.in);

        int quantidadesDeNotas = 0;
        double nota = 0;
        double total = 0;

        while(nota != -1){
            System.out.println("Informe a nota: ");
            nota = entrada.nextDouble();


            if(nota <= 10 && nota >= 0){
                total += nota;
                quantidadesDeNotas++;

            }else if(nota != -1){
                System.out.println("Nota invalida!!! ;D");
            }
        }

        double media = total / quantidadesDeNotas;
        System.out.println("Media = " + media);
    }
}

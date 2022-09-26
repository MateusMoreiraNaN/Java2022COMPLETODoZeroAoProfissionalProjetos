package EstruturasDeControle;

import java.util.Scanner;

public class Aula28DoWHILE {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String valor = "";

        do{
            System.out.println("Você precisa falar as palavras certas...");
            System.out.print("Quer sair? ");
            valor = entrada.nextLine();
        }while(!valor.equalsIgnoreCase("por favor"));

        System.out.println("Obrigado");

        entrada.close();
    }
}

package EstruturasDeControle;

import java.util.Scanner;

public class Aula27While2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String valor = "";

        while(!valor.equalsIgnoreCase("sair")){
            System.out.println("Você diz: ");
            valor = entrada.nextLine();
        }

        entrada.close();
    }
}

package ArraysECollections;

import java.util.Locale;
import java.util.Scanner;

public class DesafioArray2 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantas notas: ");

        int qtdecNotas = entrada.nextInt();

        double[] notas = new double[qtdecNotas];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Informe a nota " + i + 1 + ": ");
            notas[i] = entrada.nextDouble();
        }

        double total = 0;
        for (double nota: notas) {
            total += nota;
        }

        double media = total / notas.length;

        System.out.println("A média é " + media + "!");

        entrada.close();
    }
}

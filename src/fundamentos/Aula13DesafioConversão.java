package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class Aula13DesafioConversão {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Locale.setDefault(new Locale("en", "US"));
        Scanner salarios = new Scanner(System.in);

        System.out.println("Salario do mês de Junho: ");
        String salario1 = salarios.nextLine().replace(",", ".");
        System.out.println("Salario do mês de Julho: ");
        String salario2 = salarios.nextLine().replace(",", ".");
        System.out.println("Salario do mês de Agosto: ");
        String salario3 = salarios.nextLine().replace(",", ".");

        double SalarioDou1 = Double.parseDouble(salario1);
        double SalarioDou2 = Double.parseDouble(salario2);
        double SalarioDou3 = Double.parseDouble(salario3);

        double soma = SalarioDou1 + SalarioDou2 + SalarioDou3;

        System.out.println("A media é:: " + soma / 3);








        salarios.close();
    }
}

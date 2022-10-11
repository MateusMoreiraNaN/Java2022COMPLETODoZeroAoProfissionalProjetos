package ArraysECollections;

import java.util.Locale;
import java.util.Scanner;

public class DesafioArray {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Scanner Calcular = new Scanner(System.in);

        System.out.println("Digite a notas 1: ");
        double nota1 = Calcular.nextDouble();
        System.out.println("Digite a notas 2: ");
        double nota2 = Calcular.nextDouble();
        System.out.println("Digite a notas 3: ");
        double nota3 = Calcular.nextDouble();
        System.out.println("Digite a notas 4: ");
        double nota4 = Calcular.nextDouble();


        double[] notas = { nota1, nota2, nota3, nota4 };

        double totalAluno = 0;
        for (int i = 0; i < notas.length; i++) {
            totalAluno += notas[i];
        }

        double notaFinal = totalAluno / notas.length;

        //System.out.println("Sua nota é " + notaFinal);

        if(notaFinal < 0 || notaFinal > 10){
            System.out.println("Nota invalida");
        }else if(notaFinal > 7.0 && notaFinal <= 10){
            System.out.println("Sua nota é " + notaFinal);
            System.out.println("APROVADO");
        }else if(notaFinal > 4.5 && notaFinal < 7.0){
            System.out.println("Sua nota é " + notaFinal);
            System.out.println("RECUPERAÇÃO");
        }else if(notaFinal >= 0 && notaFinal <= 4.5){
            System.out.println("Sua nota é " + notaFinal);
            System.out.println("REPROVADO");
        }

        Calcular.close();
    }
}

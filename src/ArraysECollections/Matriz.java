package ArraysECollections;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner turma = new Scanner(System.in);

        System.out.println("Quantos alunos? ");
        int qtdeAlunos = turma.nextInt();
        System.out.println("Quantas notas por aluno? ");
        int qtdeNotas = turma.nextInt();

        double[][] notasDaTurma = new double[qtdeAlunos][qtdeAlunos];

        double total = 0;
        for (int a = 0; a < notasDaTurma.length; a++) {
            for (int n = 0; n < notasDaTurma[a].length; n++) {

                System.out.printf("Informe a nota %d do aluno %d: ", n + 1, a + 1);
                notasDaTurma[a][n] = turma.nextDouble();
                total += notasDaTurma[a][n];
            }
        }


        double media = total / (qtdeAlunos * qtdeNotas);
        System.out.println("Média da turma é " + media);
        turma.close();
    }
}

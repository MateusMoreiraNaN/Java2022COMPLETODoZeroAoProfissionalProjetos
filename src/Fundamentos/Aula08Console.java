package Fundamentos;

import java.util.Scanner;

public class Aula08Console {
    public static void main(String[] args) {
        System.out.print("Bom");
        System.out.print(" dia!\n");
        System.out.println("Bom");
        System.out.println("dia!");

        System.out.printf("Megasena %d %d %d %d %d %d \n", 1, 2, 3, 4, 5, 6);

        System.out.printf("Salário %.1f\n", 1234.56789);

        System.out.printf("Nome: %s\n", "Mateus");
        System.out.printf("Programador %s %s\n", "Java", "junior");

        //Monitoramento do teclado
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu nome: \n");
        String nome = entrada.nextLine();
        //System.out.println("Olá " + nome + " Bem vindo!");

        System.out.println("Digite o seu Sobrenome: \n");
        String sobrenome = entrada.nextLine();
        //System.out.println("Olá " + nome + " " + sobrenome);

        System.out.println("Digite a sua idade: \n");
        int idade = entrada.nextInt();
        System.out.println("Meu nome é " + nome + " " + sobrenome + " e tenho " + idade + " anos");

        entrada.close();

        System.out.println("fim".concat("!!!"));
    }
}

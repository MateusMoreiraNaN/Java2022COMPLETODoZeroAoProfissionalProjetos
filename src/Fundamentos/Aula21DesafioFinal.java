package Fundamentos;

import java.util.Scanner;

public class Aula21DesafioFinal {
    public static void main(String[] args) {
        Scanner calculadora = new Scanner(System.in);

        System.out.print("Valor 1: ");
        int n1 = calculadora.nextInt();

        System.out.print("Valor 2: ");
        int n2 = calculadora.nextInt();

        System.out.print("Operação (+, -, *, /): ");
        String op = calculadora.next();
        String resultado = "";

        Boolean mais = op.equals("+");
        resultado = mais ? Integer.toString(n1 + n2) : resultado;

        Boolean menos = op.equals("-");
        resultado = menos ? Integer.toString(n1 - n2) : resultado;

        Boolean vezes = op.equals("*");
        resultado = vezes ? Integer.toString(n1 * n2) : resultado;

        Boolean dividir = op.equals("/");
        resultado = dividir ? Integer.toString(n1 / n2) : resultado;

        System.out.println("Resultado da operação: " + resultado);






        calculadora.close();
    }
}

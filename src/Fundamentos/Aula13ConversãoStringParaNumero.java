package Fundamentos;

import javax.swing.*;

public class Aula13ConversãoStringParaNumero {
    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog("Digite o primeiro número: ");
        String valor2 = JOptionPane.showInputDialog("Digite o segundo número: ");

        System.out.println(valor1 + valor2);

        int numero1 = Integer.parseInt(valor1);
        int numero2 = Integer.parseInt(valor2);

        System.out.println(numero1 + numero2);
    }
}

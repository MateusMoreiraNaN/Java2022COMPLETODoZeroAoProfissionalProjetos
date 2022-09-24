package EstruturasDeControle;

import javax.swing.*;

public class Aula23ifElse {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("Informe o número: ");

        int numero = Integer.parseInt(valor);

        if(numero % 2 == 0){
            System.out.println("número par!");
        }else{
            System.out.println("Número ímpar");
        }
    }
}

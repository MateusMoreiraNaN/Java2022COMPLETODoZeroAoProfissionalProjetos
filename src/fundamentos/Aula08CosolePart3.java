package fundamentos;

import java.util.Scanner;

public class Aula08CosolePart3 {
    public static void main(String[] args) {
        Scanner MaiorDeIdade = new Scanner(System.in);
            System.out.println("Digite sua Idade: ");
            int maior = 18;
            int idade = MaiorDeIdade.nextInt();

            if(idade >= maior){
                System.out.println("Maior de idade");
            }else if(idade < maior){
                System.out.println("Menor de idade");
            }

        MaiorDeIdade.close();

    }
}

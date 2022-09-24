package Fundamentos;

import java.util.Scanner;

public  class Aula08ConsolePart2 {
    public static void main(String[] args) {
        Scanner validador = new Scanner(System.in);

        System.out.println("Email: ");
        String email = validador.next();
        String emailDB = "mateus2022";
        System.out.println("Senha: ");
        int senha = validador.nextInt();
        int senhaDB = 1234;


        if(emailDB == email){
            System.out.println("Acesso Liberado");
        }else if(senhaDB == senha){
            System.out.println("Acesso Liberado");
        }else if(emailDB != email && senhaDB != senha){
            System.out.println("Acesso Negado");
        }else if(email != emailDB && senha == senhaDB){
            System.out.println("Email Incorreto");
        }else if(email == emailDB && senha != senhaDB){
            System.out.println("Senha Icorreta");
        }

    }
}

/*
    class validador {
        public static void main(String[] args) {


            Scanner validador = new Scanner(System.in);



            System.out.println("Email: ");
            String email = validador.next();
            String emailDB = "mateus2022";

            System.out.println("Senha: ");
            int senha = validador.nextInt();
            int senhaDB = 1234;


            if(emailDB == email){
                System.out.println("Acesso Liberado");
            }else if(senhaDB == senha){
                System.out.println("Acesso Liberado");
            }else if(emailDB != email && senhaDB != senha){
                System.out.println("Acesso Negado");
            }else if(email != emailDB && senha == senhaDB){
                System.out.println("Email Incorreto");
            }else if(email == emailDB && senha != senhaDB){
                System.out.println("Senha Icorreta");
            }



        }
    }
*/


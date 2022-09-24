package Fundamentos.operadores;

public class Aula15OperadoresLógicoDesafio {
    public static void main(String[] args) {



        boolean terca = true;
        boolean quarta = false;

        boolean S = true;
        boolean N = false;


        if(S == terca && S == quarta){
            String Tv1 = "50 POLEGADAS";
            System.out.println("VAMOS PRO SHOPPING NO FINAL DE SEMANA");
            System.out.println("E COMPRAR UMA TV DE " + Tv1);
            System.out.println("DEPOIS VAMOS IR TOMAR SORVETE");
        }else if (terca == N && quarta == N) {
            System.out.println("VAMOS FICAR EM CASA");
            System.out.println("EE COM FOME KKKKKKKK");
        }else if(terca == S || quarta == S){
            String Tv2 = "32 POLEGADAS";
            System.out.println("VAMOS PRO SHOPPING NO FINAL DE SEMANA");
            System.out.println("E COMPRAR UMA TV DE " + Tv2);
            System.out.println("DEPOIS VAMOS IR TOMAR SORVETE");
        }else{
            System.out.println("não entendi");
        }







    }
}

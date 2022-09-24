package Fundamentos;

public class Aula02DesafioVarConst {
    public static void main(String[] args) {
        // (°F - 32) x 5/9 = °C

        final int n1 = 5;
        final int n2 = 9;
        int F = 111;
        int cover = (F - 32) * n1/n2;

        System.out.println(cover +"°C");


    }
}

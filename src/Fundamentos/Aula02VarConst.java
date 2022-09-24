package Fundamentos;

public class Aula02VarConst {
    public static void main(String[] args) {
        //var
        double raio = 3.4;
        //const
        final double pi = 3.14159;
        //final double area = pi * raio * raio;
        double area = pi * raio * raio;

        //sout
        System.out.println(area);

        raio = 10;
        area = pi * raio * raio;

        System.out.println("Area = " + area + "m2.");



        //System.out.println();
    }
}

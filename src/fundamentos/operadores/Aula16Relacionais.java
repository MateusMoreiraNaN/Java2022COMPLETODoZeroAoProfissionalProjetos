package fundamentos.operadores;

public class Aula16Relacionais {
    public static void main(String[] args) {
        int a = 97;
        int b = 'a';

        System.out.println(a == b);
        System.out.println(3 > 4);
        System.out.println(3 >= 4);
        System.out.println(3 < 4);
        System.out.println(3 <= 4);
        System.out.println(3 != 4);

        double nota = 8.3;
        boolean bomComportamento = true;

        boolean passouPorMeida = nota >= 7;
        boolean temDesconto = bomComportamento && nota >= 7;

        System.out.println("Tem desconto? " + temDesconto);
    }
}

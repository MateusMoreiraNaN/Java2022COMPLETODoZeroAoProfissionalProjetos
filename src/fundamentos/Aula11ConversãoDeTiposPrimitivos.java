package fundamentos;

public class Aula11ConversãoDeTiposPrimitivos {
    public static void main(String[] args) {

        //Não perdeu informação
        //double a = 1.123456777777778;
        double a = 1;
        System.out.println(a);

        //explícita
        //perda de imformação
        float b = (float) 1.12345677777777; // explicita (CAST)

        System.out.println(b);

        int c = 245;
        byte d = (byte) c;

        System.out.println(d);

        double e = 1.99999999999;
        int g = (int) e;
        System.out.println(g);
    }
}

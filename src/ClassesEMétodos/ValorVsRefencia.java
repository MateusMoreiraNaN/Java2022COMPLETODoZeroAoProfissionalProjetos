package ClassesEMétodos;

public class ValorVsRefencia {

    public static void main(String[] args) {

        double a = 2;
        double b = a; // atribuiçãp por valor

        a++;
        b--;

        System.out.println(a + " " + b);

        Aula34Data d1 = new Aula34Data(1, 6, 2021);
        Aula34Data d2 = d1; // atribuição por referencia (Objeto)

        d1.dia = 31;
        d2.mes = 12;

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

        voltarDataParaValorPadrao(d1);
        voltarDataParaValorPadrao(d2);
        voltarDataParaValorPadrao(d1);
        voltarDataParaValorPadrao(d2);

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

        int c = 5;
        alterarPrimitivo(c);
        System.out.println(c);
    }

    static void voltarDataParaValorPadrao(Aula34Data d){
        d.dia = 1;
        d.mes = 1;
        d.ano = 1970;
    }

    static void  alterarPrimitivo(int a){
        a++;
    }
}

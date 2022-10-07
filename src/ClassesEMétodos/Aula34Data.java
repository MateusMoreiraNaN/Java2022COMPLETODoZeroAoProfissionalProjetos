package ClassesEMétodos;

public class Aula34Data {
    int dia;
    int mes;
    int ano;

    Aula34Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    Aula34Data(){
        //dia = 20;
        //mes = 2;
        //ano = 2012;

        this(1, 1, 1970);
    }

    String obterDataFormatada(){
        final String formato = "%d/%d/%d";
        return String.format(formato, this.dia, mes, ano);
    }

    void imprimirDataFormatada(){
        //System.out.printf("%d/%d/%d\n", dia, mes, ano);

        System.out.println(obterDataFormatada());
    }


}

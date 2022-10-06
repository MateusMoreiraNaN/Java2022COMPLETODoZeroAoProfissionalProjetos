package ClassesEMétodos;

public class Aula34Data {
    int dia;
    int mes;
    int ano;

    Aula34Data(int diaI, int mesI, int anoI){
        dia = diaI;
        mes = mesI;
        ano = anoI;
    }

    Aula34Data(){
        dia = 20;
        mes = 2;
        ano = 2012;
    }

    String obterDataFormatada(){
        return String.format("%d/%d/%d", dia, mes, ano);
    }

    void imprimirDataFormatada(){
        //System.out.printf("%d/%d/%d\n", dia, mes, ano);

        System.out.println(obterDataFormatada());
    }


}

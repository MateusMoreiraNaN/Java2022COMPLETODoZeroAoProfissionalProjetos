package ClassesEMétodos;

public class Aula34DataMain {

    public static void main(String[] args) {
        Aula34Data data = new Aula34Data();

        data.dia = 15;
        data.mes = 11;
        data.ano = 1914;

        var data2 = new Aula34Data();

        data2.dia = 27;
        data2.mes = 9;
        data2.ano = 2022;

        System.out.println(data.dia + "/" + data.mes + "/" + data.ano);
        System.out.println(data2.dia + "/" + data2.mes + "/" + data2.ano);


    }
}

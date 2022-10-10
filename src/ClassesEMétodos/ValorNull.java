package ClassesEMétodos;

public class ValorNull {
    public static void main(String[] args) {

        String s1 = "";

        System.out.println(s1.concat("!!!"));

        Aula34Data data = null;
        if(data != null){
            data.mes = 3;
        }

        String s2 = null;
        System.out.println(s2.concat("??????"));
    }
}

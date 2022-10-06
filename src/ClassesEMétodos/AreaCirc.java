package ClassesEMétodos;

public class AreaCirc {

    double raio;
    static final double PI = 3.1415;

    AreaCirc(double raioInicial){

        raio = raioInicial;

    }

    double area(){
        return PI * Math.pow(raio, 2);
    }

}

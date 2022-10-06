package ClassesEMétodos;

public class AreaCircTeste {
    public static void main(String[] args) {
        AreaCirc a1 = new AreaCirc(10);
        //a1.pi = 10;

        AreaCirc a2 = new AreaCirc(5);
        //a2.pi = 5;

        //AreaCirc.pi = 3.1451;

        System.out.println(a1.area());

        //AreaCirc.pi = 1.2;
        System.out.println(a2.area());
        System.out.println(AreaCirc.PI);
        System.out.println(Math.PI);
    }
}

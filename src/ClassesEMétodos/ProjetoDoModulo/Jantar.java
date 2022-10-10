package ClassesEMétodos.ProjetoDoModulo;

public class Jantar {
    public static void main(String[] args) {

        Pessoa meuNome = new Pessoa("Mateus", 64.78);

        //comida.nome = "Mateus";
        //comida.peso = 64.82;

        Comida mcdonalds = new Comida("Batata frita", 0.321);
        Comida lasanha = new Comida("Lasanha", 0.135);

        //mcdonalds.nomeDaComida = "Batata frita";
        //mcdonalds.pesoDaComida = 0.223;

        System.out.println(meuNome.apresentar());
        meuNome.comer(mcdonalds);
        System.out.println(meuNome.apresentar());
        meuNome.comer(lasanha);
        System.out.println(meuNome.apresentar());
    }
}

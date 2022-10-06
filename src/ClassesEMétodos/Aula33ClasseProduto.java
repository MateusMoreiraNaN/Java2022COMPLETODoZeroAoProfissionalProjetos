package ClassesEMétodos;

public class Aula33ClasseProduto {

    String nome;
    double preco;
    static double desconto = 0.25;

    Aula33ClasseProduto(String nomeInicial, double precoInicial, double v){
        nome = nomeInicial;
        preco = precoInicial;

    }

    Aula33ClasseProduto(){

    }

    /*
    float precoComDesconto(){
        return (float) (preco + (1 - desconto));
    }
    */

    double precoComDesconto(){
        return preco * (1 - desconto);
    }

    double precoComDesconto(double descontoDoGerente, double funcionarios){
        return preco * (1 - desconto + descontoDoGerente);
    }
}

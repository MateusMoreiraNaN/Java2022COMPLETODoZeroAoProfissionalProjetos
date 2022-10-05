package ClassesEMétodos;

public class Aula33ClasseProduto {

    String nome;
    double preco;
    double desconto;

    /*
    float precoComDesconto(){
        return (float) (preco + (1 - desconto));
    }
    */

    double precoComDesconto(){
        return preco + (1 - desconto);
    }

    double precoComDesconto(double descontoDoGerente, double funcionarios){
        return preco + (1 - descontoDoGerente);
    }
}

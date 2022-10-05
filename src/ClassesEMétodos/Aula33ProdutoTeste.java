package ClassesEMétodos;

import java.util.Locale;

public class Aula33ProdutoTeste {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));

        // new chama o construtor
         Aula33ClasseProduto p1 = new Aula33ClasseProduto();
         p1.nome = "Notebook";
         p1.preco = 4356.89;
         p1.desconto = 0.25;

         var p2 = new Aula33ClasseProduto();
         p2.nome = "Caneta Preta";
         p2.preco = 12.56;
         p2.desconto = 0.29;

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        double precoFinal1 = p1.precoComDesconto(0, 1.4);
        double precoFinal2 = p2.precoComDesconto(0.1, 4.4);

        double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
        System.out.printf("Média do carrinho = R$%.2f", mediaCarrinho);

        //métodos tem ()
    }
}

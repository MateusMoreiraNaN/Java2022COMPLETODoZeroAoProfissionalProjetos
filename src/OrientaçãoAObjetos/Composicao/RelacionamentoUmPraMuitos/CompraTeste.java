package OrientaçãoAObjetos.Composicao.RelacionamentoUmPraMuitos;

public class CompraTeste {
    public static void main(String[] args) {

        Compra Compra1 = new Compra();
        Compra1.cliente = "João Pedro";
        //Compra1.itens.add(new Item("Celular", 4, 18.348));
        //Compra1.itens.add(new Item("PS5", 1, 5.458));
        //Compra1.itens.add(new Item("livro", 4, 18.348));

        //Compra1.adionarItem(new Item("Celular", 4, 18.348));
        //Compra1.adionarItem(new Item("PS5", 1, 5.458));
        //Compra1.adionarItem(new Item("livro", 4, 18.348));

        Compra1.adicionarItem("Celular", 4, 18.348);
        Compra1.adicionarItem("PS5", 1, 5.458);
        Compra1.adicionarItem("livro", 4, 18.348);

        System.out.println(Compra1.itens.size());
        System.out.println(Compra1.getValorTotal());
    }
}

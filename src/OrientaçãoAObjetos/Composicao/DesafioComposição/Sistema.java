package OrientaçãoAObjetos.Composicao.DesafioComposição;

public class Sistema {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Mateus");

        Compra compra1 = new Compra();
        compra1.adicionarItem("iphone xr", 2457.88, 3);
        compra1.adicionarItem(new Produto("Notebook", 1874.45), 2);

        Compra compra2 = new Compra();
        compra2.adicionarItem("PS5", 4547.99, 2);
        compra2.adicionarItem(new Produto("TV", 2454.45), 1);

        cliente.compras.add(compra1);
        cliente.compras.add(compra2);

        System.out.println(cliente.obterValorTotal());
    }

}

public class Main {
    public static void main(String[] args) {

        Sistema sistema = new Sistema();

        Produto p1 = new Produto("X-Burguer", "Hambúrguer", 20);
        Produto p2 = new Produto("Refrigerante", "Coca-Cola", 8);

        Pedido pedido = new Pedido("17/04/2026");

        pedido.adicionarProduto(p1);
        pedido.adicionarProduto(p2);

        pedido.finalizar();

        sistema.registrarPedido(pedido);

        System.out.println("Total do pedido: " + pedido.calcularTotal());
        System.out.println("Faturamento do dia: " + sistema.faturamentoPorDia("17/04/2026"));
    }
}
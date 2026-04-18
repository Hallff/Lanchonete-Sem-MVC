import java.util.ArrayList;
import java.util.List;

public class Sistema {

    private List<Pedido> pedidos = new ArrayList<>();

    public void registrarPedido(Pedido p) {
        pedidos.add(p);
    }

    public List<Pedido> buscarPorData(String data) {
        List<Pedido> lista = new ArrayList<>();

        for (Pedido p : pedidos) {
            if (data.equals(p.getData())) {
                lista.add(p);
            }
        }

        return lista;
    }

    public double faturamentoPorDia(String data) {
        double total = 0;

        for (Pedido p : pedidos) {
            if (data.equals(p.getData()) && p.isFinalizado()) {
                total += p.calcularTotal();
            }
        }

        return total;
    }
}
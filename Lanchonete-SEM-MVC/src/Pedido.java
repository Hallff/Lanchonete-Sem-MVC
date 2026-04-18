import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private List<Produto> produtos = new ArrayList<>();
    private String data;
    private boolean finalizado;

    public Pedido(String data) {
        if (data == null || data.trim().isEmpty()) {
            throw new IllegalArgumentException("Data inválida");
        }

        this.data = data;
        this.finalizado = false;
    }

    public void adicionarProduto(Produto p) {
        produtos.add(p);
    }

    public void finalizar() {
        if (produtos.isEmpty()) {
            throw new IllegalStateException("Pedido vazio!");
        }
        finalizado = true;
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto p : produtos) {
            total += p.getPreco();
        }
        return total;
    }

    public String getData() {
        return data;
    }

    public boolean isFinalizado() {
        return finalizado;
    }
}
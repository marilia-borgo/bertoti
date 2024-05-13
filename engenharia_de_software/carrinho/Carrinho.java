import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private double total;
    private List<Produto> produtos;

    public Carrinho() {
        this.total = 0.0;
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        total += produto.getPreco();
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
        total -= produto.getPreco();
    }

    public double calcularTotal() {
        return total;
    }
    public List<Produto> produtos() {
        return produtos;
    }
    
  
}

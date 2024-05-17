import org.junit.Test;
import static org.junit.Assert.*;

public class CarrinhoTest {

    @Test
    public void testAdicionarProduto() {
        Carrinho carrinho = new Carrinho();
        Produto produto1 = new Produto("Arroz", 10, 5.50);

        carrinho.adicionarProduto(produto1);

        assertEquals(1, carrinho.produtos().size());
        assertEquals(5.50, carrinho.calcularTotal(), 0.001);
    }

    @Test
    public void testRemoverProduto() {
        Carrinho carrinho = new Carrinho();
        Produto produto1 = new Produto("Arroz", 10, 5.50);

        carrinho.adicionarProduto(produto1);
        carrinho.removerProduto(produto1);

        assertEquals(0, carrinho.produtos().size());
        assertEquals(0.0, carrinho.calcularTotal(), 0.001);
    }

    @Test
    public void testCalcularTotal() {
        Carrinho carrinho = new Carrinho();
        Produto produto1 = new Produto("Arroz", 10, 5.50);
        Produto produto2 = new Produto("Feijão", 20, 4.00);

        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);

        assertEquals(9.50, carrinho.calcularTotal(), 0.001);
    }
}

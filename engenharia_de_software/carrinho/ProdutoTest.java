import org.junit.Test;

import static org.junit.Assert.*;


public class ProdutoTest {

    @Test
    public void testProdutoConstructor() {
        Produto produto = new Produto("Arroz", 10, 5.50);
        assertEquals("Arroz", produto.getNome());
        assertEquals(10, produto.getQuantidadeEstoque());
        assertEquals(5.50, produto.getPreco(), 0.001);
    }

    @Test
    public void testSetNome() {
        Produto produto = new Produto("Arroz", 10, 5.50);
        produto.setNome("Feijão");
        assertEquals("Feijão", produto.getNome());
    }

    @Test
    public void testSetQuantidadeEstoque() {
        Produto produto = new Produto("Arroz", 10, 5.50);
        produto.setQuantidadeEstoque(20);
        assertEquals(20, produto.getQuantidadeEstoque());
    }

    @Test
    public void testSetPreco() {
        Produto produto = new Produto("Arroz", 10, 5.50);
        produto.setPreco(6.00);
        assertEquals(6.00, produto.getPreco(), 0.001);
    }
}

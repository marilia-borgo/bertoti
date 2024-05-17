import org.junit.Test;

import static org.junit.Assert.*;

public class MercadoTest {

    @Test
    public void testCadastrarCliente() {
        Mercado mercado = new Mercado("Mercado Central", "Rua Principal");
        Cliente cliente = new Cliente("user123", "senha123");
        mercado.cadastrarCliente(cliente);
        assertTrue(mercado.logarCliente("user123", "senha123") != null);
    }

    @Test
    public void testLogarCliente() {
        Mercado mercado = new Mercado("Mercado Central", "Rua Principal");
        Cliente cliente = new Cliente("user123", "senha123");
        mercado.cadastrarCliente(cliente);
        assertTrue(mercado.logarCliente("user123", "senha123") != null);
        assertNull(mercado.logarCliente("user123", "senha456"));
    }

    @Test
    public void testAdicionarProduto() {
        Mercado mercado = new Mercado("Mercado Central", "Rua Principal");
        Produto produto = new Produto("Arroz", 10, 5.0);
        mercado.adicionarProduto(produto);
        assertEquals(1, mercado.getProdutos().size());
    }

    @Test
    public void testListarEstoque() {
        Mercado mercado = new Mercado("Mercado Central", "Rua Principal");
        Produto p1 = new Produto("Arroz", 10, 5.0);
        Produto p2 = new Produto("Feijão", 15, 7.0);
        mercado.adicionarProduto(p1);
        mercado.adicionarProduto(p2);
        String expectedOutput = "Estoque do mercado Mercado Central:\n" +
                                "Nome: Arroz, Preço: 5.0, Estoque: 10\n" +
                                "Nome: Feijão, Preço: 7.0, Estoque: 15";
        assertEquals(expectedOutput, getOutput(mercado::listarEstoque));
    }

    //pesquisei como fazer o teste sendo que fiz o print e saí com isso, espero que seja a melhor maneira de fazer
    private String getOutput(Runnable action) {
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));
        action.run();
        System.setOut(null);
        return out.toString().trim();
    }
}

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class ClienteTest {

    @Test
    public void testGetUsuario() {
        Cliente cliente = new Cliente("usuarioTeste", "senhaTeste");
        assertEquals("usuarioTeste", cliente.getUsuario());
    }

    @Test
    public void testGetSenha() {
        Cliente cliente = new Cliente("usuarioTeste", "senhaTeste");
        assertEquals("senhaTeste", cliente.getSenha());
    }

    @Test
    public void testListarProdutosDoCarrinhoVazio() {
        Cliente cliente = new Cliente("usuarioTeste", "senhaTeste");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        cliente.listarProdutosDoCarrinho();
        
        assertEquals("Carrinho vazio.", outContent.toString().trim());
    }

}

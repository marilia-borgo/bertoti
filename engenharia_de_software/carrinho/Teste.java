package engenharia_de_software.carrinho;

import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;

public class Teste {
    
    @Test
    public void testBuscarProdutoComNomeExistente() {
        Produto produto = new Produto(1, "camiseta", 50, 2);
        produto.cadastrarProduto(produto);

        List<Produto> encontradoProduto = produto.buscarProduto("camiseta");

        assertEquals(1, encontradoProduto.size());
    }
}


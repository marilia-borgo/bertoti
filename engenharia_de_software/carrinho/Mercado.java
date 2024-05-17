import java.util.ArrayList;
import java.util.List;

public class Mercado {
    private List<Cliente> clientes;
    private List<Produto> produtos;
    private String nome;
    private String localizacao;

    public Mercado(String nome, String localizacao) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.clientes = new ArrayList<>();
        this.produtos = new ArrayList<>();
    }

    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public Cliente logarCliente(String usuario, String senha) {
        for (Cliente cliente : clientes) {
            if (cliente.getUsuario().equals(usuario) && cliente.getSenha().equals(senha)) {
                return cliente;
            }
        }
        return null;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public List<Produto> getProdutos () {
        return produtos;
        
    }

    public void listarEstoque() {
        System.out.println("Estoque do mercado " + nome + ":");
        for (Produto produto : produtos) {
            System.out.println("Nome: " + produto.getNome() + ", Preço: " + produto.getPreco() + ", Estoque: " + produto.getQuantidadeEstoque());
        }
    }

  
}

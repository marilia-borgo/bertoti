import java.util.List;

public class Cliente {
    private Carrinho carrinho;
    private String usuario;
    private String senha;

    public Cliente(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
        this.carrinho = new Carrinho();
    }

    public String getUsuario () {
        return usuario;
    }

    public String getSenha () {
        return senha;
    }

    public void listarProdutosDoCarrinho() {
        List<Produto> produtos = carrinho.produtos();
        if (produtos.isEmpty()) {
            System.out.println("Carrinho vazio.");
        } else {
            System.out.println("Produtos no carrinho:");
            for (Produto produto : produtos) {
                System.out.println("Nome: " + produto.getNome() + ", Preço: " + produto.getPreco());
            }
        }
    }

}

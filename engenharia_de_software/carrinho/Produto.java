package engenharia_de_software.carrinho;

import java.util.LinkedList;
import java.util.List;

public class Produto {

    private int id;
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    private List<Produto> produtos = new LinkedList<Produto>();

    public Produto(int id, String nome, double preco, int quantidadeEstoque) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public List<Produto> buscarProduto(String nome) {
        List<Produto> produtosEncontrados = new LinkedList<Produto>();
        for (Produto produto: produtos) {
            if (produto.getNome().equals(nome)) produtosEncontrados.add(produto);
        }
        return produtosEncontrados;
    }
    public void setProduto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        
    }
    
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void cadastrarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto() {
    }

    public void alterarProduto() {
    }

}

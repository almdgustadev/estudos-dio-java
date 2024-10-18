package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, int quantidade, double preco){
        produtoSet.add(new Produto(nome, codigo, quantidade, preco));
    }

    public Set<Produto> exibiProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        System.out.println(cadastroProdutos.exibiProdutosPorNome());
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
        System.out.println(cadastroProdutos.produtoSet);


        cadastroProdutos.adicionarProduto(1, "Abacaxi", 10, 5);
        cadastroProdutos.adicionarProduto(3, "Caqui", 10, 10);
        cadastroProdutos.adicionarProduto(2, "Banana", 10, 3);
        cadastroProdutos.adicionarProduto(4, "Damasco", 10, 15);
        System.out.println(cadastroProdutos.produtoSet);

        System.out.println(cadastroProdutos.exibiProdutosPorNome());
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());






    }

}

package map.Pesquisa;
import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long , Produto> estoqueProdutoMap;

    public EstoqueProdutos() {
        this.estoqueProdutoMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutoMap.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos(){
        if (!estoqueProdutoMap.isEmpty()) {
            System.out.println(estoqueProdutoMap);   
        }else{
            System.out.println("O estoque está vazio!");
        }
    }

    public double calcularValorTotalEstoque(){
        double valorTotal = 0;
        if (!estoqueProdutoMap.isEmpty()) {
            for(Produto p : estoqueProdutoMap.values()){
                valorTotal += p.getQuantidade() * p.getPreco();
            }          
        }
        return valorTotal;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutoMap.isEmpty()) {
            for (Produto p : estoqueProdutoMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                    maiorPreco = p.getPreco();      
                }
            }   
        }
        return produtoMaisCaro;
        
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if (!estoqueProdutoMap.isEmpty()) {
            for (Produto p : estoqueProdutoMap.values()) {
                if (p.getPreco() < menorPreco) {
                    produtoMaisBarato = p;
                    menorPreco = p.getPreco();
                }
            }   
        }
        return produtoMaisBarato;
    }
    
    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorQuantidadeValorNoEstoque = null;
        double maiorValorTotalProdutoEstoque = 0d;
        if (!estoqueProdutoMap.isEmpty()) {
          for (Map.Entry<Long, Produto> entry : estoqueProdutoMap.entrySet()) {
            double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
            if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) {
              maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
              produtoMaiorQuantidadeValorNoEstoque = entry.getValue();
            }
          }
        }
        return produtoMaiorQuantidadeValorNoEstoque;
      }


    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        
        estoque.exibirProdutos();

        estoque.adicionarProduto(1L, "PÃO", 10, 0.5);
        estoque.adicionarProduto(2L, "COCA COLA 2L", 1, 14);
        estoque.adicionarProduto(3L, "PEITO DE FRANGO 1 KG", 1, 18);
        estoque.adicionarProduto(4L, "SUCO DE UVA 1L ", 1, 8);

        estoque.exibirProdutos();
        System.out.println("O preço total do estoque é de R$" + estoque.calcularValorTotalEstoque());
        System.out.println("O produto mais barato é " + estoque.obterProdutoMaisBarato());
        System.out.println("O produto mais caro é " + estoque.obterProdutoMaisCaro());



    }
    
}

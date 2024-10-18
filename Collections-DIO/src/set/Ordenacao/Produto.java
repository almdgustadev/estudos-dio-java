package set.Ordenacao;

import java.util.Comparator;

public class Produto implements Comparable<Produto> {
    private String nome;
    private long codigo;
    private int quantidade;
    private double preco;
    
    public Produto(String nome, long codigo, int quantidade, double preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public long getCodigo() {
        return codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

   
   @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }
   
   
    

    @Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + (int) (codigo ^ (codigo >>> 32));
    return result;
}

@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Produto other = (Produto) obj;
    if (codigo != other.codigo)
        return false;
    return true;
}

    @Override
    public String toString() {
        return "Produto- " + nome + "| Codigo: " + codigo + "| Quantidade:" + quantidade + "| preco: R$" + preco ;
    }

}

class ComparatorPorPreco implements Comparator<Produto>{

    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
        
    }

}
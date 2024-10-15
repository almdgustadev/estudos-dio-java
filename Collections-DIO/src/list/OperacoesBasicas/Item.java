package list.OperacoesBasicas;

public class Item {
    private String nomeItem;
    private double valorItem;
    private int quantidadeItem;
    
    public Item(String nomeItem, double valorItem, int quantidadeItem) {
        this.nomeItem = nomeItem;
        this.valorItem = valorItem;
        this.quantidadeItem = quantidadeItem;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public double getValorItem() {
        return valorItem;
    }

    public int getQuantidadeItem() {
        return quantidadeItem;
    }

    @Override
    public String toString() {
        return "Item [Nome= " + nomeItem + ", Valor= R$" + valorItem + ", Quantidade= " + quantidadeItem + "]";
    }
    
    

}

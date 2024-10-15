package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras(){
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nomeItem, double valorItem , int quantidadeItem ){
        Item item = new Item(nomeItem, valorItem, quantidadeItem);
        itemList.add(item);
    }

    public void removerItem(String nomeItem){
        List<Item> itemParaRemover = new ArrayList<>();

        if (!(itemList.isEmpty())) {
            for( Item i : itemList){
                if (i.getNomeItem().equalsIgnoreCase(nomeItem)) {
                    itemParaRemover.add(i);             
                }
            }
            itemList.removeAll(itemParaRemover);          
        }else{
            System.out.println("A lista está vazia!");
        }
        
    }


    public double calcularValorTotal(){
        double preco, quantidade ,total = 0;
        
        if(!itemList.isEmpty()){
            for (Item item : itemList) {
                preco = item.getValorItem();
                quantidade = item.getQuantidadeItem();
                total = (preco *quantidade) + total;
            }        
            return total;
        }else{
            throw new RuntimeException("A lista está vazia");
        }
        
    }

    public void exibirItens(){
        if(!itemList.isEmpty()){
            System.out.println(itemList);
        }else{
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.exibirItens();
        
        carrinhoDeCompras.adicionarItem("Coca cola 1L", 9.20 , 1);
        carrinhoDeCompras.adicionarItem("Pão", 0.5, 10);
        carrinhoDeCompras.exibirItens();
        
        carrinhoDeCompras.removerItem("Coca cola 1L");
        
        carrinhoDeCompras.adicionarItem("Coca cola 2L", 14.00 , 1);
        carrinhoDeCompras.exibirItens();


        System.out.println("O valor da compra é de R$ " + String.format("%.2f", carrinhoDeCompras.calcularValorTotal()));


    }
}

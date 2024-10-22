package map.Pesquisa;
import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> contagemPalavraMap;

    public ContagemPalavras() {
        this.contagemPalavraMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        contagemPalavraMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        if (!contagemPalavraMap.isEmpty()) {
            contagemPalavraMap.remove(palavra);           
        }
    }

    public int exibirContagemPalavras(){
        int contagemTotal = 0;
        for (int  contagem : contagemPalavraMap.values()) {
            contagemTotal += contagem;
        }
        return contagemTotal;
    }

    public String encontrarPalavraMaisFrequente(){
        String palavraMaisFrequente = null;
        int maiorContagem = 0;
        for (Map.Entry<String, Integer> entry : contagemPalavraMap.entrySet()) {
            if (entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue();
                palavraMaisFrequente = entry.getKey(); 
            }
        }
        return palavraMaisFrequente;
    }
    
    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        System.out.println("O total de palavras é " + contagemPalavras.exibirContagemPalavras());

        contagemPalavras.adicionarPalavra("Fluminense", 12);
        contagemPalavras.adicionarPalavra("Flamengo", 2);
        contagemPalavras.adicionarPalavra("Botafogo", 1);
        contagemPalavras.adicionarPalavra("Vasco", 1);
        contagemPalavras.adicionarPalavra("Neymar", 120);

        System.out.println("O total de palavras é " + contagemPalavras.exibirContagemPalavras());
        System.out.println("A palavra mais frequente é " + contagemPalavras.encontrarPalavraMaisFrequente());
        contagemPalavras.removerPalavra("Flamengo");
        System.out.println("O total de palavras é " + contagemPalavras.exibirContagemPalavras());


    }
}

package map.OperacoesBasicas;
import java.util.HashMap;
import java.util.Map;


public class Dicionario{
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }
        
    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if(!dicionarioMap.isEmpty()){
            dicionarioMap.remove(palavra);
        }

    }

    public void exibirPalavra(){
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra){
        String definicao = dicionarioMap.get(palavra);
        if(!dicionarioMap.isEmpty()){
            return definicao;
        }
        return "Linguagem não encontrada no dicionario";
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("java", "linguagem que vou aprender");
        dicionario.adicionarPalavra("python", "linguagem da faculdade");
        dicionario.adicionarPalavra("sql", "banco de dados");

        //dicionario.exibirPalavra();

        dicionario.removerPalavra("python");
        dicionario.exibirPalavra();

        System.out.println("A palavra pesquisada foi java e seu signficado é:  " + dicionario.pesquisarPorPalavra("java"));



        
    }
    


}



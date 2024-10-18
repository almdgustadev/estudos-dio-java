package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<Palavra> palavraSet;

    public ConjuntoPalavrasUnicas() {
        this.palavraSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavraSet.add(new Palavra(palavra));
    }

    public void removerPalavra(String palavra){
        Palavra palavraParaRemover = null;

        for (Palavra p : palavraSet) {
            if (p.getPalavra().equalsIgnoreCase(palavra)) {
                palavraParaRemover = p;
                break; 
            }           
        }
        palavraSet.remove(palavraParaRemover);
    }

    public void verificarPalavra(String palavra){
        Palavra palavraParaVerificar = null;

        for (Palavra p : palavraSet) {
            if (p.getPalavra().equalsIgnoreCase(palavra)) {
                palavraParaVerificar = p;
                break;          
            }     
        }

        if (palavraParaVerificar == null) {
            System.out.println("A palavra não está presente no conjunto!");       
        }else{
            System.out.println("Está presente no conjunto " + palavraParaVerificar);
        }
        

    }

    public void exibirPalavrasUnicas(){
        System.out.println(palavraSet);
    }

    
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
        conjuntoPalavrasUnicas.verificarPalavra("fluminense");

        conjuntoPalavrasUnicas.adicionarPalavra("fluminense");
        conjuntoPalavrasUnicas.adicionarPalavra("fluminense");
        conjuntoPalavrasUnicas.adicionarPalavra("vasco");
        conjuntoPalavrasUnicas.adicionarPalavra("botafogo");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
        conjuntoPalavrasUnicas.verificarPalavra("fluminense");

        conjuntoPalavrasUnicas.removerPalavra("vasco");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    }
}

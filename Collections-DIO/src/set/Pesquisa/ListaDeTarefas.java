package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaDeTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaDeTarefas() {
        this.tarefaSet = new HashSet<>();
    }
    
    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaParaRemover = null;
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaRemover = t;
                break;        
            }          
        }
        tarefaSet.remove(tarefaParaRemover);
    }

    public void exibirTarefas(){
        if(!tarefaSet.isEmpty()){            
            System.out.println(tarefaSet);
        }
        
    }

    public int contarTarefas(){
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (t.isConcluida()) {
                tarefasConcluidas.add(t);              
            }   
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (!t.isConcluida()) {
                tarefasPendentes.add(t);              
            }   
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){        
        for (Tarefa t : tarefaSet) {
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConcluida(true);
                break;
            }
            
        }
        
    }

    public void marcarTarefaPendente(String descricao){
        Tarefa tarefaPendente = null;
        for (Tarefa t : tarefaSet) {
            if(t.getDescricao().equalsIgnoreCase(descricao)){              
                tarefaPendente= t;
                break;
            }        
        }

        if(tarefaPendente != null){
            if(tarefaPendente.isConcluida()){
                tarefaPendente.setConcluida(false);
            }
        }else{
            System.out.println("TAREFA NÃO ENCONTRADA NA LISTA!");
        }
            
        
        
    }

    public void limparListaTarefa(){
        if(tarefaSet.isEmpty()){
            System.out.println("A lista já está vazia!");
        }else{
            tarefaSet.clear();
        }
    }

    public static void main(String[] args) {
        ListaDeTarefas listaDeTarefas = new ListaDeTarefas();

        listaDeTarefas.adicionarTarefa("Estudar");
        listaDeTarefas.adicionarTarefa("Correr");
        listaDeTarefas.adicionarTarefa("Arrumar o quarto");
        listaDeTarefas.adicionarTarefa("Fazer o almoco");

        listaDeTarefas.exibirTarefas();

        listaDeTarefas.removerTarefa("Arrumar o quarto");
        listaDeTarefas.exibirTarefas();

        System.out.println("Número total de tarefas na lista: " + listaDeTarefas.contarTarefas());
        
        System.out.println(listaDeTarefas.obterTarefasPendentes());

        listaDeTarefas.marcarTarefaConcluida("Estudar");
        listaDeTarefas.marcarTarefaConcluida("Correr");

        System.out.println(listaDeTarefas.obterTarefasConcluidas());
        System.out.println(listaDeTarefas.obterTarefasPendentes());

        listaDeTarefas.marcarTarefaPendente("Estudar");
        System.out.println(listaDeTarefas.obterTarefasPendentes());

        listaDeTarefas.limparListaTarefa();
        listaDeTarefas.exibirTarefas();

    }


}

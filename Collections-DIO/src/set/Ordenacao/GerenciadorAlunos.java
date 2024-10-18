package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double nota){
        alunoSet.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(long matricula){
        Aluno alunoParaRemover = null;
        for (Aluno a : alunoSet) {
            if (a.getMatricula() == matricula) {
                alunoParaRemover = a;
                break;          
            } 
        }
        alunoSet.remove(alunoParaRemover);
    }

    public void exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
        
        if(!alunoSet.isEmpty()){
            System.out.println(alunosPorNome);
        }else{
            System.out.println("O conjunto esta vazio");
        }
    }

    public void exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        if (!alunoSet.isEmpty()) {
            alunosPorNota.addAll(alunoSet);
            System.out.println(alunosPorNota);   
        }else{
            System.out.println("O conjunto está vazio!");
        }

    }

    public void exibirAluno(){
        if (!alunoSet.isEmpty()) {
            System.out.println(alunoSet);
        }
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Gustavo", 12345L, 11);
        gerenciadorAlunos.adicionarAluno("Kaique", 9999L, 8);
        gerenciadorAlunos.adicionarAluno("Higor", 11111L, 9);
        gerenciadorAlunos.adicionarAluno("Ana Laura", 0001L, 10);

        gerenciadorAlunos.exibirAluno();
        gerenciadorAlunos.exibirAlunosPorNome();
        gerenciadorAlunos.exibirAlunosPorNota();






        
    }

}

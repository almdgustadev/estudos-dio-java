package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }


    public void adicionarPessoa(String nome,  int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
        return pessoaPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        
        
        ordenacaoPessoa.adicionarPessoa("Gustavo", 19, 1.84);
        ordenacaoPessoa.adicionarPessoa("Kaique", 18, 1.75);
        ordenacaoPessoa.adicionarPessoa("Higor", 17, 1.79);

        //System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}

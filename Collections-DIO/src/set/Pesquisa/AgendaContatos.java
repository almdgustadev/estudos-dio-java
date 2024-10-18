package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }


    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }   
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }           
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Gustavo", 1111111);
        agendaContatos.adicionarContato("Gustavo", 00000);
        agendaContatos.adicionarContato("Gustavo de oliveira", 9222222);
        agendaContatos.adicionarContato("Kaique", 12345678);
        agendaContatos.adicionarContato("higor", 666666);
        agendaContatos.adicionarContato("fernando", 555555);
        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Gustavo"));

        System.out.println("Contato autalizado: " + agendaContatos.atualizarNumeroContato("higor", 7777777));

        agendaContatos.exibirContatos();
    }
}

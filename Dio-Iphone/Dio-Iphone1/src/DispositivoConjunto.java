import aparelhoTelefonico.DispositivoAparelhoTelefonico;
import navegadorInternet.DispositivoNavegadorInternet;
import reprodutorMusical.DispositivoReprodutorMusical;

public class DispositivoConjunto implements DispositivoReprodutorMusical, DispositivoAparelhoTelefonico, DispositivoNavegadorInternet {
    public void tocar() {
        System.out.println("TOCANDO MÚSICA NO IPHONE");
    }

    public void pausar() {
        System.out.println("PAUSANDO MÚSICA NO IPHONE");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Escolher esta musica: " + musica);
    }
    
    public void ligar(String numero){
        System.out.println("Ligar para o numero: " + numero);

    }

    public void atender(){
        System.out.println("ATENDEU O TELEFONE");
    }

    public void iniciarCorreioVoz(){
        System.out.println("APOS O BIP, DEIXE SUA MENSAGEM NO CORREIO DE VOZ");
    }

    public void exibirPagina(String url){
        System.out.println("Voce esta acessando: " + url);
    }

    public void adicionarNovaAba(){
        System.out.println("ADICIONANDO NOVA ABA");
    }

    public void atualizarPagina(){
        System.out.println("ATUALIZANDO PAGINA");
    }
}
    

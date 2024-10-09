public class Iphone {
    public static void main(String[] args) throws Exception {
        DispositivoConjunto iphone = new DispositivoConjunto();

        iphone.selecionarMusica("Uma e Quinze da Manhã");
        iphone.tocar();  
        iphone.pausar();
        
        System.out.println("//");

        iphone.ligar("75092099922");
        iphone.iniciarCorreioVoz();
        iphone.atender();
        
        System.out.println("//");

        iphone.adicionarNovaAba();
        iphone.exibirPagina("www.ge.globo.com");
        iphone.atualizarPagina();

    
    
    }
}

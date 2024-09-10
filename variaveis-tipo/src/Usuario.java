public class Usuario {

    public static void main(String[] args) throws Exception {
    
        SmartTv smartTv = new SmartTv();

        System.out.println("A Tv está ligada ? " + smartTv.ligada);
        System.out.println("Em qual canal está a Tv? " + smartTv.canal);
        System.out.println("Qual o volume da Tv? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("A Tv está ligada agora? " + smartTv.ligada);

        smartTv.mudarCanal(24);
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.aumentarVolume();
        System.out.println("Qual o volume da Tv no momento? " + smartTv.volume);



    }
    
}

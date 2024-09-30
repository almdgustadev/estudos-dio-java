import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int parametroUm, parametroDois, interacao;

        System.out.println("DIGITE O PRIMEIRO NUMERO: ");
        parametroUm = input.nextInt();

        System.out.println("DIGITE O SEGUNDO NUMERO: ");
        parametroDois = input.nextInt();

        if(parametroDois > parametroUm ){
            interacao = parametroDois - parametroUm;

            for(int i = 1 ; i <= interacao ; i++ ){
                System.out.println("Imprimindo o numero " + i);
    
            }
    
            input.close();
        }else{
            System.out.println("O SEGUNDO NÚMERO DEVE SER MAIOR QUE O PRIMEIRO");
        }
        

        

    }
}

package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros{
    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numeros.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        for (Integer numero : numeros) {
            soma = numero + soma;  
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;
        if(!numeros.isEmpty()){
            for (Integer numero : numeros) {
                if (numero >= maiorNumero) {
                    maiorNumero = numero;
                    
                } 
            }
            return maiorNumero;
        }else{
            throw new RuntimeException("A lista está vazia!");
        }    
    }

    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        if(!numeros.isEmpty()){
            for (Integer numero : numeros) {
                if (numero <= menorNumero) {
                    menorNumero = numero;
                    
                } 
            }
            return menorNumero;
        }else{
            throw new RuntimeException("A lista está vazia!");
        }    
    }
    
    public void exibirNumeros(){
        if(!numeros.isEmpty()){
            System.out.println(this.numeros);
        }else{
            System.out.println("A Lista está vazia!");
        }
    }

    public static void main(String[] args) {
        
        SomaNumeros somaNumeros = new SomaNumeros();

        //somaNumeros.adicionarNumero(10);
        //somaNumeros.adicionarNumero(20);
        //somaNumeros.adicionarNumero(30);
        //somaNumeros.adicionarNumero(40);
        //somaNumeros.adicionarNumero(50);
        //somaNumeros.exibirNumeros();
        //System.out.println("A soma dos numeros da lista é de " + somaNumeros.calcularSoma()); 
        System.out.println("O maior numero da lista é " + somaNumeros.encontrarMaiorNumero());
        System.out.println("O menor numero da lista é " + somaNumeros.encontrarMenorNumero()); 

 






    }
}
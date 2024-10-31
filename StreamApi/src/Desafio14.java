import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Desafio14 {
    public static void main(String[] args) {
        List <Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3,11,53);

        List<Integer> numerosPrimo = numeros.stream()
            .filter(n -> n % 2 != 0 && n % 3 != 0 && n % 5 != 0)
            .collect(Collectors.toList());

       

        System.out.println(numerosPrimo.stream().max(Integer :: compareTo));    
        
    }
}

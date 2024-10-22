package map.Ordenacao;
import java.util.*;


public class LivrariaOnline {
    private Map<String,Livro> livrariaOnline;

    public LivrariaOnline() {
        this.livrariaOnline = new HashMap<>();
    }

    public void adicionarLivro(String link, Livro livro){
        livrariaOnline.put(link, livro);
    }

    public void removerLivro(String titulo){
        List<String> chavesRemover = new ArrayList<>();

        for (Map.Entry<String, Livro> entry : livrariaOnline.entrySet()) {
            if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
                chavesRemover.add(entry.getKey());  
            }
        }
        
        for(String chave : chavesRemover){
            livrariaOnline.remove(chave);
        }
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorPreco = new ArrayList<>(livrariaOnline.entrySet());
    
        Collections.sort(livrosParaOrdenarPorPreco, new ComparatorPorPreco());
    
        Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();
    
        for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorPreco) {
          livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
        }
    
        return livrosOrdenadosPorPreco;
      }
    
      public Map<String, Livro> exibirLivrosOrdenadosPorAutor() {
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorAutor = new ArrayList<>(livrariaOnline.entrySet());
    
        Collections.sort(livrosParaOrdenarPorAutor, new ComparatorPorAutor());
    
        Map<String, Livro> livrosOrdenadosPorAutor = new LinkedHashMap<>();
    
        for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorAutor) {
          livrosOrdenadosPorAutor.put(entry.getKey(), entry.getValue());
        }
    
        return livrosOrdenadosPorAutor;
      }
    
      public Map<String, Livro> pesquisarLivrosPorAutor(String autor) {
        Map<String, Livro> livrosPorAutor = new LinkedHashMap<>();
        for (Map.Entry<String, Livro> entry : livrariaOnline.entrySet()) {
          Livro livro = entry.getValue();
          if (livro.getAutor().equals(autor)) {
            livrosPorAutor.put(entry.getKey(), livro);
          }
        }
        return livrosPorAutor;
      }
    
      public List<Livro> obterLivroMaisCaro() {
        List<Livro> livrosMaisCaros = new ArrayList<>();
        double precoMaisAlto = Double.MIN_VALUE;
    
        if (!livrariaOnline.isEmpty()) {
          for (Livro livro : livrariaOnline.values()) {
            if (livro.getPreco() > precoMaisAlto) {
              precoMaisAlto = livro.getPreco();
            }
          }
        } else {
          throw new NoSuchElementException("A livraria está vazia!");
        }
    
        for(Map.Entry<String, Livro> entry: livrariaOnline.entrySet()) {
          if(entry.getValue().getPreco() == precoMaisAlto) {
            Livro livroComPrecoMaisAlto = livrariaOnline.get(entry.getKey());
            livrosMaisCaros.add(livroComPrecoMaisAlto);
          }
        }
        return livrosMaisCaros;
      }
    
      public List<Livro> obterLivroMaisBarato() {
        List<Livro> livrosMaisBaratos = new ArrayList<>();
        double precoMaisBaixo = Double.MAX_VALUE;
    
        if (!livrariaOnline.isEmpty()) {
          for (Livro livro : livrariaOnline.values()) {
            if (livro.getPreco() < precoMaisBaixo) {
              precoMaisBaixo = livro.getPreco();
            }
          }
        } else {
          throw new NoSuchElementException("A livraria está vazia!");
        }
    
        for(Map.Entry<String, Livro> entry: livrariaOnline.entrySet()) {
          if(entry.getValue().getPreco() == precoMaisBaixo) {
            Livro livroComPrecoMaisBaixo = livrariaOnline.get(entry.getKey());
            livrosMaisBaratos.add(livroComPrecoMaisBaixo);
          }
        }
        return livrosMaisBaratos;
      }

    
    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();

        livrariaOnline.adicionarLivro("https://amzn.to/3EclT8Z", new Livro("1984", "George Orwell", 16d));
        livrariaOnline.adicionarLivro("https://a.co/d/esNXbdh", new Livro("Eu e Esse meu Coração", "C. C. Hunter", 40d));
        livrariaOnline.adicionarLivro("https://a.co/d/9HvrXkX", new Livro("Frankenstein: edição bolso de luxo: Ou O Prometeu moderno", "Mary Shelley", 44d));
        livrariaOnline.adicionarLivro("https://a.co/d/csjqSWb", new Livro("É Assim que Acaba: 1", "Colleen Hoover", 39d));
        livrariaOnline.adicionarLivro("https://a.co/d/bPHUFDv", new Livro("O homem mais rico da Babilônia", "George S Clason ", 22d));
    
        //System.out.println(livrariaOnline.exibirLivrosOrdenadosPorAutor());
        //System.out.println(livrariaOnline.exibirLivrosOrdenadosPorPreco());
        System.out.println("O livro mais caro é" + livrariaOnline.obterLivroMaisCaro());
        System.out.println("O livro mais barato é " + livrariaOnline.obterLivroMaisBarato());
        livrariaOnline.removerLivro("1984");
        System.out.println("O livro mais barato é " + livrariaOnline.obterLivroMaisBarato());

        //System.out.println(livrariaOnline.exibirLivrosOrdenadosPorAutor());
    }

}

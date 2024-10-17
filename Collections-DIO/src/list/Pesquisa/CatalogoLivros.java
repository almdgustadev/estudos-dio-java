package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }
    
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        Livro livro = new Livro(titulo, autor, anoPublicacao);
        livroList.add(livro);
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);                 
                }

            }

        }
        return livrosPorAutor;
    }
    

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if(!livroList.isEmpty()){
            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao()<= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                    
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;

        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
                
            }
        }
        return livroPorTitulo;

    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        
        
        catalogoLivros.adicionarLivro("A Vida", "Gustavo de Almeida", 2018);
        catalogoLivros.adicionarLivro("A Vida - O que vem depois", "Gustavo de Almeida", 2022);
        catalogoLivros.adicionarLivro("A Pandemia", "Gustavo de Almeida", 2023);
        catalogoLivros.adicionarLivro("O Conto do Jack", "Kaique Lopes", 2007);
        catalogoLivros.adicionarLivro("O Conto do Jack", "Kaique Lopes", 2009);


        System.out.println("Os livros do autor Gustavo de Almeida são: " + catalogoLivros.pesquisarPorAutor("Gustavo de Almeida"));
        System.out.println("Os livros publicado entre 2020 e 2023 são: " + catalogoLivros.pesquisarPorIntervaloAnos(2020, 2023));
        System.out.println("O livro chamado A Vida: " + catalogoLivros.pesquisarPorTitulo("O Conto do Jack"));




        
    }


}

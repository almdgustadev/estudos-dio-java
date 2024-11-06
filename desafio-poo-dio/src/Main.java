import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.lang.management.MemoryNotificationInfo;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();


        curso1.setTitulo("Java iniciante");
        curso1.setDescricao("Curso para iniciantes");
        curso1.setCargoHoraria(8);
        curso2.setTitulo("Python iniciante");
        curso2.setDescricao("Curso python para iniciantes");
        curso2.setCargoHoraria(10);
       // System.out.println(curso1);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("Sanar duvidas sobre java");
        mentoria.setData(LocalDate.now());
        //System.out.println(mentoria);

        BootCamp bootcamp = new BootCamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGustavo = new Dev();
        devGustavo.setNome("Gustavo");
        devGustavo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Gustavo: " + devGustavo.getConteudosInscritos());
        devGustavo.progredir();
        devGustavo.progredir();
        System.out.println("Conteúdos concluídos Gustavo: " + devGustavo.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos Gustavo: " + devGustavo.getConteudosInscritos());
        System.out.println("XP: " + devGustavo.calcularTotalXp());

        System.out.println("==============================================");

        Dev devLaura = new Dev();
        devLaura.setNome("Laura");
        devLaura.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Laura" + devLaura.getConteudosInscritos());
        devLaura.progredir();
        System.out.println("Conteúdos concluídos Laura: " + devLaura.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos Laura" + devLaura.getConteudosInscritos());
        System.out.println("XP: " + devLaura.calcularTotalXp());



    }
}

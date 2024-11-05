import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.lang.management.MemoryNotificationInfo;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Java iniciante");
        curso1.setDescricao("Curso para iniciantes");
        curso1.setCargoHoraria(8);
        System.out.println(curso1);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("Sanar duvidas sobre java");
        mentoria.setData(LocalDate.now());
        System.out.println(mentoria);
    }
}

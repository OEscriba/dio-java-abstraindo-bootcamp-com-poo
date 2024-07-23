import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Básico de Java");
        curso1.setDescricao("Curso para iniciantes em Java");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Básico de Python");
        curso2.setDescricao("Curso para iniciantes em Python");
        curso2.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria para iniciantes em Java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}

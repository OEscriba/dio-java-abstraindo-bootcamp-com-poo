import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
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

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp para treinar desenvolvedores em Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devFernando = new Dev();
        devFernando.setNome("Fernando");
        devFernando.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Fernando: " + devFernando.getConteudosInscritos());
        devFernando.progredir();
        System.out.println("..........");
        System.out.println("Conteúdos Inscritos Fernando: " + devFernando.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Fernando: " + devFernando.getConteudosConcluidos());
        System.out.println("XP Atual: " + devFernando.calcularTotalXp());
        
        System.out.println("===========");
        
        Dev devMarcos = new Dev();
        devMarcos.setNome("Marcos");
        devMarcos.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Marcos: " + devMarcos.getConteudosInscritos());
        devMarcos.progredir();
        devMarcos.progredir();
        System.out.println("..........");
        System.out.println("Conteúdos Inscritos Marcos: " + devMarcos.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Marcos: " + devMarcos.getConteudosConcluidos());
        System.out.println("XP Atual: " + devMarcos.calcularTotalXp());
    }
}

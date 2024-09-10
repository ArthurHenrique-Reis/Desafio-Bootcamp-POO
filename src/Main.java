import br.com.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso1.setTitulo("curso js");
        curso1.setDescricao("descrição curso js");
        curso1.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devArthur = new Dev();
        devArthur.setNome("Arthur");
        devArthur.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Arthur:" + devArthur.getConteudosInscritos());
        devArthur.progredir();
        devArthur.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Arthur:" + devArthur.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Arthur:" + devArthur.getConteudosConcluidos());
        System.out.println("XP:" + devArthur.calcularTotalXp());

        System.out.println("----------------");

        Dev devFulano = new Dev();
        devFulano.setNome("Fulano");
        devFulano.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Fulano:" + devFulano.getConteudosInscritos());
        devFulano.progredir();
        devFulano.progredir();
        devFulano.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Fulano:" + devFulano.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Fulano:" + devFulano.getConteudosConcluidos());
        System.out.println("XP:" + devFulano.calcularTotalXp());



    }
}

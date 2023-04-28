import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição cac");
        curso2.setCargaHoraria(6);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoia java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("Bootcamp Java Developer");
        bootCamp.setDescricao("Desccrição Bootcamp Java Developer ");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev devVitor = new Dev();
        devVitor.setNome("Vitor");
        devVitor.inscreverBootcamp(bootCamp);
        System.out.println("Conteudos Inscritos Vitor: " + devVitor.getConteudoInscritos());
        devVitor.progredir();
        devVitor.progredir();

        System.out.println("--");

        System.out.println("Conteudos Inscritos Vitor: " + devVitor.getConteudoInscritos());
        System.out.println("Conteudos Concluidos Vitor: " + devVitor.getConteudosConcluidos());
        System.out.println("XP: " + devVitor.calcularXp());

        System.out.println("-------------");

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootCamp);
        System.out.println("Conteudos inscristos Pedro: " + devPedro.getConteudoInscritos());
        devPedro.progredir();
        devPedro.progredir();
        devPedro.progredir();

        System.out.println("--");

        System.out.println("Conteudos inscristos Pedro: " + devPedro.getConteudoInscritos());
        System.out.println("Conteudos Concluidos Pedro: " + devPedro.getConteudosConcluidos());
        System.out.println("XP: " + devPedro.calcularXp());




    }
}

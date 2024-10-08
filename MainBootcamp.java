import java.time.LocalDate;

public class MainBootcamp {
   
    public static void main(String[] args){

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Lucas:" + devLucas.getConteudosInscritos());
        devLucas.progredir();
        devLucas.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Lucas:" + devLucas.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Lucas:" + devLucas.getConteudosConcluidos());
        System.out.println("XP:" + devLucas.calcularTotalXP());

        System.out.println("-------");

        Dev devJefferson = new Dev();
        devJefferson.setNome("Jefferson");
        devJefferson.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Jefferson:" + devJefferson.getConteudosInscritos());
        devJefferson.progredir();
        devJefferson.progredir();
        devJefferson.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Jefferson:" + devJefferson.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Jefferson:" + devJefferson.getConteudosConcluidos());
        System.out.println("XP:" + devJefferson.calcularTotalXP());

    }
}

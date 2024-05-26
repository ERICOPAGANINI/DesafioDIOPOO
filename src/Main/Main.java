package Main;

import java.time.LocalDate;

import Dominio.Bootcamp;
import Dominio.Curso;
import Dominio.Dev;
import Dominio.Mentoria;

public class Main {

	public Main() {
	}

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Curso Java para iniciantes");
		curso1.setCargaHoraria(80);
		//System.out.println(curso1);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JavaScript");
		curso2.setDescricao("Curso JavaScript para iniciantes");
		curso2.setCargaHoraria(120);
		//System.out.println(curso2);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria de Java");
		mentoria1.setDescricao("Mentoria sobre Abstracao em Java");
		mentoria1.setData(LocalDate.parse("2024-05-06"));
		//System.out.println(mentoria1);
		
		Bootcamp bootcampJAVA = new Bootcamp();
		bootcampJAVA.setNome("Bootcamp Java Developer");
		bootcampJAVA.setDescricao("Bootcamp para desenvolvedores iniciantes em Java");
		bootcampJAVA.getConteudos().add(curso1);
		bootcampJAVA.getConteudos().add(curso2);
		bootcampJAVA.getConteudos().add(mentoria1);
		
		Dev desenvolvedor1 = new Dev();
		Dev desenvolvedor2 = new Dev();
		desenvolvedor1.setNome("Erico");
		desenvolvedor2.setNome("Dapheely");
		
		System.out.println("Conteudos Inscritos Erico" + desenvolvedor1.getConteudosInscritos());
		System.out.println("Conteudos Inscritos Dapheely" + desenvolvedor2.getConteudosInscritos());
		
		desenvolvedor1.inscreverBootCamp(bootcampJAVA);
		desenvolvedor2.inscreverBootCamp(bootcampJAVA);
		
		System.out.println("Conteudos Inscritos Erico" + desenvolvedor1.getConteudosInscritos());
		System.out.println("Conteudos Inscritos Dapheely" + desenvolvedor2.getConteudosInscritos());
		
		
		System.out.println("Conteudos Concluidos Erico" + desenvolvedor1.getConteudosConcluidos());
		System.out.println("Conteudos Concluidos Dapheely" + desenvolvedor2.getConteudosConcluidos());
		
		desenvolvedor1.progredir();
		desenvolvedor2.progredir();
		
		System.out.println("Conteudos Concluidos Erico" + desenvolvedor1.getConteudosConcluidos());
		System.out.println("Conteudos Concluidos Dapheely" + desenvolvedor2.getConteudosConcluidos());
		System.out.println("Conteudos Inscritos Erico" + desenvolvedor1.getConteudosInscritos());
		System.out.println("Conteudos Inscritos Dapheely" + desenvolvedor2.getConteudosInscritos());

		desenvolvedor1.progredir();
		desenvolvedor2.progredir();
		desenvolvedor2.progredir(); 
		desenvolvedor2.progredir(); 
		
		System.out.println("Conteudos Concluidos Erico" + desenvolvedor1.getConteudosConcluidos());
		System.out.println("Conteudos Concluidos Dapheely" + desenvolvedor2.getConteudosConcluidos());
		System.out.println("Conteudos Inscritos Erico" + desenvolvedor1.getConteudosInscritos());
		System.out.println("Conteudos Inscritos Dapheely" + desenvolvedor2.getConteudosInscritos());
		
		System.out.println("XP erico " + desenvolvedor1.calculaXp());
		System.out.println("XP dapheely" + desenvolvedor2.calculaXp());
	}

}

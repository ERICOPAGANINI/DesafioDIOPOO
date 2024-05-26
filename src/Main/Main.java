package Main;

import java.time.LocalDate;

import Dominio.Curso;
import Dominio.Mentoria;

public class Main {

	public Main() {
	}

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTituto("Curso Java");
		curso1.setDescricao("Curso Java para iniciantes");
		curso1.setCargaHoraria(80);
		System.out.println(curso1);
		
		Curso curso2 = new Curso();
		curso2.setTituto("Curso JavaScript");
		curso2.setDescricao("Curso JavaScript para iniciantes");
		curso2.setCargaHoraria(120);
		System.out.println(curso2);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTituto("Mentoria de Java");
		mentoria1.setDescricao("Mentoria sobre Abstracao em Java");
		mentoria1.setData(LocalDate.parse("2024-05-06"));
		System.out.println(mentoria1);
		
		
	}

}

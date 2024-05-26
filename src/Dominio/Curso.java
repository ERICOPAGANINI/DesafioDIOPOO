package Dominio;

import java.time.LocalDate;

public class Curso extends Conteudo{
	private int cargaHoraria;

	public Curso() {
	}


	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}


	@Override
	public double calcularXp() {
		return XP_PADRAO * this.cargaHoraria;
	}

	public String toString() {
		return "Curso{ Titulo: " +getTitulo() + ", Descricao: " + getDescricao()+ ", Data: " + this.cargaHoraria;
	}

}

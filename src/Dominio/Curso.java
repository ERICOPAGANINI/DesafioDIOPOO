package Dominio;

import java.time.LocalDate;

public class Curso {
	private String descricao;
	private String tituto;
	private int cargaHoraria;

	public Curso() {

	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTituto() {
		return tituto;
	}

	public void setTituto(String tituto) {
		this.tituto = tituto;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public String toString() {
		return String.format("[Título = %s, Descricao = %s, Carga Horária =%sh]", tituto, descricao, cargaHoraria);
	}

}

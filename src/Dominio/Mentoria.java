package Dominio;

import java.time.LocalDate;

public class Mentoria {
	private String descricao;
	private String tituto;
	private LocalDate data;
	
	public Mentoria() {
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

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return String.format("[Tituto = %s, Descricao = %s, Data = %s]", tituto, descricao, data);
	}

}

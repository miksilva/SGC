package br.edu.ifal.modelo;

public class CursoPresencial extends Curso {

	private String cargaHoraria;
	private String nomeProfessor;
	private int numeroTurmas;
	
	public CursoPresencial() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getNome() {
		return super.getNome();
	}
	public String getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public String getNomeProfessor() {
		return nomeProfessor;
	}
	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}
	public int getNumeroTurmas() {
		return numeroTurmas;
	}
	public void setNumeroTurmas(int numeroTurmas) {
		this.numeroTurmas = numeroTurmas;
	}
	
}

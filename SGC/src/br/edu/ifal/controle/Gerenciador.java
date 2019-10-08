package br.edu.ifal.controle;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifal.modelo.CursoADistancia;
import br.edu.ifal.modelo.CursoPresencial;

public class Gerenciador {

	private List<CursoPresencial> cursoP;
	private List<CursoADistancia> cursoAD;
	
	public Gerenciador() {
		cursoP = new ArrayList<CursoPresencial>();
		cursoAD = new ArrayList<CursoADistancia>();
	}
	
	public void adicionarCursoP(CursoPresencial cursoPresencial) {
		cursoP.add(cursoPresencial);
		System.out.println("Curso de " +cursoPresencial.getNome() + " cadastrado com sucesso.");
	}
	
	public void adicionarCursoAD(CursoADistancia cursoADistancia) {
		cursoAD.add(cursoADistancia);
		System.out.println("Curso de " +cursoADistancia.getNome() + " cadastrado com sucesso.");
	}
	
	public void listarCursosP() {
		for(int i = 0; i < cursoP.size(); i++) {
			CursoPresencial curso = cursoP.get(i);
			if(curso == null) {
				System.out.println("Não há cursos presenciais cadastrados.");
			} else {
				System.out.println("" + curso.getNome());
			}
		}
	}
	
	public void listarCursosAD() {
		for(int i = 0; i < cursoAD.size(); i++) {
			CursoADistancia curso = cursoAD.get(i);
			if(curso == null) {
				System.out.println("Não há cursos a distância cadastrados.");
			} else {
				System.out.println("" + curso.getNome());
			}
		}
	}
	
	public void deletarCursoP(CursoPresencial cursoPresencial, int id) {
		for (int i = 0; i < cursoP.size(); i++) {
			if(cursoP.get(i).getId() == id) {
				cursoP.remove(i);
				System.out.println("Curso deletado.");
			}
		}
	}

	public List<CursoPresencial> getCursoP() {
		return cursoP;
	}

	public void setCursoP(List<CursoPresencial> cursoP) {
		this.cursoP = cursoP;
	}

	public List<CursoADistancia> getCursoAD() {
		return cursoAD;
	}

	public void setCursoAD(List<CursoADistancia> cursoAD) {
		this.cursoAD = cursoAD;
	}
	
}

package br.edu.ifal;

import br.edu.ifal.controle.Gerenciador;
import br.edu.ifal.modelo.CursoADistancia;
import br.edu.ifal.modelo.CursoPresencial;

public class Teste {
	public static void main(String[] args) {
		Gerenciador g = new Gerenciador();
		CursoPresencial c1 = new CursoPresencial();
		CursoPresencial c2 = new CursoPresencial();
		CursoPresencial c3 = new CursoPresencial();
		CursoADistancia c4 = new CursoADistancia();
		CursoADistancia c5 = new CursoADistancia();
		CursoADistancia c6 = new CursoADistancia();
		
		
		
		c1.setNome("Programação");
		c1.setId(1);
		c1.setCargaHoraria("80h");
		c1.setNomeProfessor("Pedro");
		c1.setNumeroTurmas(3);
		g.adicionarCursoP(c1);
		
		System.out.println("-------------");
		
		c2.setNome("Programação Web 1");
		c2.setId(2);
		c2.setCargaHoraria("80h");
		c2.setNomeProfessor("Pedro");
		c2.setNumeroTurmas(3);
		g.adicionarCursoP(c2);
		
		System.out.println("------------");
		
		c3.setNome("Programação Web 2");
		c3.setId(3);
		c3.setCargaHoraria("80h");
		c3.setNomeProfessor("Pedro");
		c3.setNumeroTurmas(3);
		g.adicionarCursoP(c3);
		
		System.out.println("--------------");
		
		g.listarCursosP();
		
		System.out.println("----------------");
		
		c4.setNome("Porgramação Orientada a Objetos");
		c4.setId(4);
		c4.setCargaHoraria("80h");
		c4.setNomeProfessor("Pedro");
		c4.setNumeroTurmas(3);
		g.adicionarCursoAD(c4);
		
		
		System.out.println("------------------");
		
		c5.setNome("Banco de Dados");
		c5.setId(5);
		c5.setCargaHoraria("80h");
		c5.setNomeProfessor("Pedro");
		c5.setNumeroTurmas(4);
		g.adicionarCursoAD(c5);
		
		
		System.out.println("------------------");
		
		c6.setNome("Programação Orientada a Gambiarra");
		c6.setId(4);
		c6.setCargaHoraria("80h");
		c6.setNomeProfessor("Pedro");
		c6.setNumeroTurmas(5);
		g.adicionarCursoAD(c6);
		
		
		System.out.println("------------------");
		
		g.listarCursosAD();
		
		System.out.println("-------------------");
		
		g.deletarCursoP(c1, 1);
		
		System.out.println("----------------");
		
		g.listarCursosP();
		
		
	}

}

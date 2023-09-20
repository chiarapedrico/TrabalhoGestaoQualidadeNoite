package controller;

import controller.Aluno;
import Repository.RepositorioAluno;

public class Teste {
	public static void main(String[] args) {
		Aluno c= new Aluno();
		RepositorioAluno repAluno = new RepositorioAluno();
		
		
		c.setRa(12645623);
		c.setNome("Chiara");
		c.setCurso("Ciencia da Computação");
		c.setSexo('F');
		c.setTurno("Noite");
		
		if(repAluno.salvaAluno(c)) {
			System.out.println("Aluno salvo.");
		} 
		Aluno j= new Aluno();
		j.setRa(12645688);
		j.setNome("Julia");
		j.setCurso("Ciencia da Computação");
		j.setSexo('F');
		j.setTurno("Noite");
		
		if(repAluno.salvaAluno(j)) {
			System.out.println("Segundo aluno salvo.");
		} 
		
		System.out.println("\n");
		System.out.println(" ****** Alunos ******");
		System.out.println(repAluno.retornaListaAluno().get(0).getNome());
		System.out.println(repAluno.retornaListaAluno().get(1).getNome());

	}
}

package Repository;

import java.util.List;

import controller.Aluno;

public interface IRepositorio {
	
	public boolean salvaAluno(Aluno aluno);
	public List<Aluno> retornaListaAluno();
	public boolean atualizaAluno(Aluno aluno);
	public boolean deletaAluno(int ra);
}


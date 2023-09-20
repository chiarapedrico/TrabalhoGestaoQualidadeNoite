package Repository;

import java.util.ArrayList;
import java.util.List;

import controller.Aluno;

public class RepositorioAluno implements IRepositorio{
	
List<Aluno> listaAlunos = new ArrayList<Aluno>();
	
	@Override
	public boolean salvaAluno(Aluno aluno) {
		boolean ok;
		try {
			ok=listaAlunos.add(aluno);
		} catch (Exception e) {
			ok=false;
		}
		return ok;
		
	}

	@Override
	public List<Aluno> retornaListaAluno() {
		return listaAlunos;
	}

	@Override
	public boolean atualizaAluno(Aluno aluno) {
		aluno.getNome();
		aluno.getCurso();
		aluno.getTurno();
		aluno.getRa();
		return true;
		
	}
	

	@Override
	public boolean deletaAluno(int ra) {
		 listaAlunos.remove(ra);
		return false;
	}

}

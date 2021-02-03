package entitie;

public class Aluno  {
	
	private Integer numAluno;

	public Aluno(Integer numAluno) {
		this.numAluno = numAluno;
	}

	public Integer getNumAluno() {
		return numAluno;
	}

	public void setNumAluno(Integer numAluno) {
		this.numAluno = numAluno;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numAluno == null) ? 0 : numAluno.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (numAluno == null) {
			if (other.numAluno != null)
				return false;
		} else if (!numAluno.equals(other.numAluno))
			return false;
		return true;
	}
	
	

}

package modelo;

public class Medico {
	private int id;
	private String cpf;
	private String nome;
	private String especialidade;

	
	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = (int) id;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}


	
}


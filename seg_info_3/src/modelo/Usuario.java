package modelo;

public class Usuario {
	private int id;
	private long login_hash;
	private long senha_hash;
	private int senha_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getLogin_hash() {
		return login_hash;
	}
	public void setLogin_hash(long login_hash) {
		this.login_hash = login_hash;
	}
	public long getSenha_hash() {
		return senha_hash;
	}
	public void setSenha_hash(long senha_hash) {
		this.senha_hash = senha_hash;
	}
	public int getSenha_id() {
		return senha_id;
	}
	public void setSenha_id(int senha_id) {
		this.senha_id = senha_id;
	}
	
	
	


}
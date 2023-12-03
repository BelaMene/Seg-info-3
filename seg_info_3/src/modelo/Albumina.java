package modelo;

public class Albumina {
	private int id;
	private byte tipoMetrica;
	private byte resultado;
	private int pacienteId;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public byte getTipoMetrica() {
		return tipoMetrica;
	}
	public void setTipoMetrica(byte tipoMetrica) {
		this.tipoMetrica = tipoMetrica;
	}
	public byte getResultado() {
		return resultado;
	}
	public void setResultado(byte resultado) {
		this.resultado = resultado;
	}
	public int getPacienteId() {
		return pacienteId;
	}
	public void setPacienteId(int pacienteId) {
		this.pacienteId = pacienteId;
	}
	
	
	
}
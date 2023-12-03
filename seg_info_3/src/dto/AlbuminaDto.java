package dto;

public class AlbuminaDto {
	private String tipoMetrica;
	private String resultado;
	public AlbuminaDto(String tipoMetrica, String resultado) {
		this.tipoMetrica = tipoMetrica;
		this.resultado = resultado;
	}
	public String getTipoMetrica() {
		return tipoMetrica;
	}
	public String getResultado() {
		return resultado;
	}
}

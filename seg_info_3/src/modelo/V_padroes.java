package modelo;

public class V_padroes {
	private int id;
	private double valor_normal;
	private double valor_deplecao_leve;
	private double valor_deplecao_moderada;
	private double valor_deplecao_grave;
	private String unidade;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getValor_normal() {
		return valor_normal;
	}
	public void setValor_normal(double valor_normal) {
		this.valor_normal = valor_normal;
	}
	public double getValor_limite_inferior() {
		return valor_deplecao_grave;
	}
	public void setValor_limite_inferior(double valor_limite_inferior) {
		this.valor_deplecao_grave = valor_limite_inferior;
	}
	public double getValor_limite_superior() {
		return valor_deplecao_leve;
	}
	public void setValor_limite_superior(double valor_limite_superior) {
		this.valor_deplecao_leve = valor_limite_superior;
	}
	public String getUnidade() {
		return unidade;
	}
	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	public double getValor_deplecao_moderada() {
		return valor_deplecao_moderada;
	}
	public void setValor_deplecao_moderada(double valor_deplecao_moderada) {
		this.valor_deplecao_moderada = valor_deplecao_moderada;
	}
	
	
	
		


}
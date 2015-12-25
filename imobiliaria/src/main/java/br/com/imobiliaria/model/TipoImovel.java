package br.com.imobiliaria.model;

public enum TipoImovel {

	APARTAMENTO("Apartamento"),
	TERRENO("Terreno"),
	CASA("Casa"),
	COMODO_COMERCIAL("Cômodo Especial");
	
	private String descricao;
	
	TipoImovel(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
}

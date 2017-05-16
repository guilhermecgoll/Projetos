package br.com.crmob.model;

public enum TipoRole {

	ADMIN(0, "ROLE_ADMIN"),
	COMPANY(1, "ROLE_COMPANY"),
	EXTERNAL(2, "ROLE_EXTERNAL");

	private int index;
	private String descricao;
	
	private TipoRole(int index, String descricao) {
		this.index = index;
		this.descricao = descricao;
	}

	public String getDescricao() {
		return this.descricao;
	}
	
	public int getIndex(){
		return this.index;
	}

	public TipoRole getTipoRole(String descricao) {
		TipoRole ret = null;
		for (TipoRole tipoRole : TipoRole.values()) {
			if (tipoRole.name().equalsIgnoreCase(descricao)) {
				ret = tipoRole;
				break;
			}
		}
		return ret;
	}

}

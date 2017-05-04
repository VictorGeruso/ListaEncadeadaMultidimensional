package br.ucsal.bes.ed20171.listaencadeadamultidimencional;

public class NoCategoria {

	private int codigoCategoria;
	private String descricao;
	private NoCategoria prox;
	private NoProduto inicio = null;

	public NoCategoria(int codigoCategoria, String descricao) {
		this.codigoCategoria = codigoCategoria;
		this.descricao = descricao;
	}

	public int getCodigoCategoria() {
		return codigoCategoria;
	}

	public void setCodigoCategoria(int codigoCategoria) {
		this.codigoCategoria = codigoCategoria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public NoCategoria getProx() {
		return prox;
	}

	public void setProx(NoCategoria prox) {
		this.prox = prox;
	}

	public NoProduto getInicio() {
		return inicio;
	}

	public void setInicio(NoProduto inicio) {
		this.inicio = inicio;
	}

	public boolean ehVazia() {
		return inicio == null;
	}

	@Override
	public String toString() {
		return "---------------------------------------" + "\nCodigo da categoria: " + getCodigoCategoria()
				+ "\nDescrição: " + getDescricao() + "\n---------------------------------------";
	}

}

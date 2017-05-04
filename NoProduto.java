package br.ucsal.bes.ed20171.listaencadeadamultidimencional;

public class NoProduto {
	
	private int codigoProduto;
	private String descricao;
	private double valor;
	private int quantidade;
	private NoProduto prox;
	
	public NoProduto(int codigoProduto, String descricao, double valor, int quantidade) {
		this.codigoProduto = codigoProduto;
		this.descricao = descricao;
		this.valor = valor;
		this.quantidade = quantidade;
	}

	public int getCodigoProduto() {
		return codigoProduto;
	}
	
	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public NoProduto getProx() {
		return prox;
	}
	
	public void setProx(NoProduto prox) {
		this.prox = prox;
	}

	@Override
	public String toString() {
		return "---------------------------------------" + "\nCodigo do produto: " + getCodigoProduto() + "\ndescrição: " + getDescricao() + "\nValor: " + getValor()
				+ "\nQuantidade: " + getQuantidade() + "\n---------------------------------------";
	}
	
}

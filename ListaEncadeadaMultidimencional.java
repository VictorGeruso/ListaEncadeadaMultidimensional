package br.ucsal.bes.ed20171.listaencadeadamultidimencional;

public class ListaEncadeadaMultidimencional {

	private NoCategoria inicio = null;

	public void inserirCategoria(int codigoCategoria, String descricao) {
		NoCategoria novo = new NoCategoria(codigoCategoria, descricao);
		novo.setCodigoCategoria(codigoCategoria);
		novo.setDescricao(descricao);
		if (ehVazia()) {
			inicio = novo;
		} else {
			novo.setProx(inicio);
			inicio = novo;
		}
	}

	public void inserirProduto(int codigoProduto, String descricao, double valor, int quantidade, int codigoCategoria) {
		NoProduto novo = new NoProduto(codigoProduto, descricao, valor, quantidade);
		novo.setCodigoProduto(codigoProduto);
		novo.setDescricao(descricao);
		novo.setValor(valor);
		novo.setQuantidade(quantidade);
		NoCategoria auxC = inicio;
		while (auxC.getProx() != null && auxC.getCodigoCategoria() != codigoCategoria) {
			auxC = auxC.getProx();
		}
		if (auxC.getProx() == null && auxC.getCodigoCategoria() != codigoCategoria) {
			System.out.println("Categoria não encontrada...");
		} else {
			if (auxC.ehVazia()) {
				auxC.setInicio(novo);
			} else {
				novo.setProx(auxC.getInicio());
				auxC.setInicio(novo);
			}
		}
	}

	public void removerCategoria(int codigoCategoria) {
		if (ehVazia()) {
			System.out.println("Lista de categorias vazia...");
		} else {
			NoCategoria ant = null;
			NoCategoria aux = inicio;
			while (aux.getProx() != null && aux.getCodigoCategoria() != codigoCategoria) {
				ant = aux;
				aux = aux.getProx();
			}
			if (ant == null) {
				inicio = inicio.getProx();
				aux = null;
			} else if (aux.getProx() == null) {
				if (aux.getCodigoCategoria() == codigoCategoria) {
					ant.setProx(null);
					aux = null;
				} else {
					System.out.println("Categoria não encontrada...");
				}
			} else {
				ant.setProx(aux.getProx());
				aux = null;
			}
		}
	}

	public void removerProduto(int codigoCategoria, int codigoProduto) {
		if (ehVazia()) {
			System.out.println("Lista de categorias vazia...");
		} else {
			NoCategoria auxC = inicio;
			while (auxC.getProx() != null && auxC.getCodigoCategoria() != codigoCategoria) {
				auxC = auxC.getProx();
			}
			if (auxC.getProx() == null && auxC.getCodigoCategoria() != codigoCategoria) {
				System.out.println("Categoria não encontrada...");
			}else{
				if(auxC.ehVazia()){
					System.out.println("Não possuem produtos cadastrados nesta categoria...");
				}else{
					NoProduto ant = null;
					NoProduto auxP = auxC.getInicio();
					while (auxP.getProx() != null && auxP.getCodigoProduto() != codigoProduto) {
						ant = auxP;
						auxP = auxP.getProx();
					}
					if (ant == null) {
						auxC.setInicio(auxP.getProx());
						auxP = null;
					} else if (auxP.getProx() == null) {
						if (auxP.getCodigoProduto() == codigoProduto) {
							ant.setProx(null);
							auxP = null;
						} else {
							System.out.println("Produto não encontrado");
						}
					} else {
						ant.setProx(auxP.getProx());
						auxP = null;
					}
				}
			}
		}
	}

	public void imprimirCategoria() {
		if (ehVazia()) {
			System.out.println("Lista Vazia");
		} else {
			NoCategoria aux = inicio;
			while (aux != null) {
				System.out.println(aux.toString());
				aux = aux.getProx();
			}
		}
	}

	public void imprimirProdutoCategoria(int codigoCategoria) {
		if (ehVazia()) {
			System.out.println("Lista de categorias Vazia...");
		} else {
			NoCategoria auxC = inicio;
			while (auxC.getProx() != null && auxC.getCodigoCategoria() != codigoCategoria) {
				auxC = auxC.getProx();
			}
			if (auxC.getProx() == null && auxC.getCodigoCategoria() != codigoCategoria) {
				System.out.println("Categoria não encontrada...");
			} else {
				if (auxC.ehVazia()) {
					System.out.println("Não a Produtos nesta categoria...");
				} else {
					NoProduto auxP = auxC.getInicio();
					while (auxP != null) {
						System.out.println(auxP.toString());
						auxP = auxP.getProx();
					}
				}
			}
		}
	}

	public void imprimirProdutos() {
		if (ehVazia()) {
			System.out.println("Lista de categorias vazia...");
		} else {
			NoCategoria auxC = inicio;
			while (auxC != null) {
				System.out.println(auxC.toString());
				if (auxC.ehVazia()) {
					System.out.println("Não possuem produtos cadastrados nesta categoria");
				} else {
					NoProduto auxP = auxC.getInicio();
					while (auxP != null) {
						System.out.println(auxP.toString());
						auxP = auxP.getProx();
					}
				}
				auxC = auxC.getProx();
			}
		}
	}
	
	public boolean ehVazia() {
		return inicio == null;
	}

}

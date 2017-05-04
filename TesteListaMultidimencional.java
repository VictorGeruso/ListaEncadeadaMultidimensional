package br.ucsal.bes.ed20171.listaencadeadamultidimencional;

public class TesteListaMultidimencional {

	public static void main(String[] args) {
		
		ListaEncadeadaMultidimencional lem = new ListaEncadeadaMultidimencional();
		lem.inserirCategoria(01, "Alimentos");
		lem.inserirCategoria(02, "Produtos de Limpeza");
		lem.inserirCategoria(03, "Papelaria");
		lem.inserirCategoria(04, "Bebidas");
		
		lem.inserirProduto(01, "Queijo", 5.50, 200, 01);
		lem.inserirProduto(02, "Carne", 20.0, 200, 01);
		lem.inserirProduto(03, "Tomate", 2.0, 2000, 01);
		
		lem.inserirProduto(01, "Detergente", 0.80, 900, 02);
		lem.inserirProduto(02, "Qboa", 5.0, 500, 02);
		
		lem.inserirProduto(01, "Lapis", 0.50, 1000, 03);
		lem.inserirProduto(02, "Borracha", 0.10, 1000, 03);
		lem.inserirProduto(03, "Caneta", 1.50, 1000, 03);
		
		lem.removerCategoria(04);
		lem.removerCategoria(05);
		lem.removerProduto(03, 02);
		lem.removerProduto(01, 04);
		lem.removerProduto(05, 01);
		
		lem.imprimirProdutos();

	}

}

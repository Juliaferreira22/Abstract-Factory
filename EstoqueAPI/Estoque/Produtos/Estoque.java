package Estoque.Produtos;

public class Estoque {

    public static enum Estoques {
		EstoqueA,
		EstoqueB
	}
 
	abstract Produto SepararProduto(Produto.Cracteristicas caracteristicas);
 
	public Produtos enviarProdutos(Produtos.Cracteristicas caracteristicas) {
		Produtos produto = procurarProdutos(caracteristicas);
		System.out.println("**************************************");
		System.out.println("Preparando a " + produto.getNome() + "");
		produto.procurar();
		produto.separar();
		produto.enviar();;
		produto.rastrar();
		return produto;
	}
    
}

package Estoque.Produtos;


public abstract class Produtos {
	
	public static enum Cracteristicas {
		Nome,
		Id,
		QuantidadeEstoque,
		Cor
	}
	
	String nome;
	public Produtos(String id) {
		this.id = id;
	}

	String id;
	int QuantidadeEstoque;
    String cor; 
	

	public String getNome() {
		return nome;
	}

	public void procurar() {
		System.out.println("Procurando " + nome);
	}

	public void separar() {
		System.out.println("Separar " + nome);
	}

	public void enviar() {
		System.out.println("Enviar " + nome);
	}

	public void rastrar() {
		System.out.println("Rastrear " + nome);
	}

	public String toString() {
		StringBuffer detalhes = new StringBuffer();
		detalhes.append("**************************************\n");
		detalhes.append("Peça solicitada saiu para entrega!\n");
		detalhes.append("**************************************\n");
		detalhes.append("Classe: " + this.getClass().getCanonicalName() +  "\n");
		detalhes.append(nome  + "\n");
		detalhes.append(id + "\n");
		detalhes.append(QuantidadeEstoque + "\n");
        detalhes.append(cor + "\n");
		
		return detalhes.toString();
	}
}
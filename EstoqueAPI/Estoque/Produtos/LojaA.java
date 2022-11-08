package Estoque.Produtos;

public class LojaA extends Estoque {
    
    Produtos separarProdutos(Produtos.Cracteristicas cracteristicas) {
		if (cracteristicas.equals(Produtos.Cracteristicas.Queijo)) {
			return new PizzaDeQueijo();
		} else if (sabor.equals(Pizza.Sabor.Vegana)) {
			return new PizzaVegana();
		} else if (sabor.equals(Pizza.Sabor.Calabresa)) {
			return new PizzaDeCalabresaBairro();
		} else if (sabor.equals(Pizza.Sabor.Pepperoni)) {
			return new PizzaDePepperoni();
		} else return null;
	}
}

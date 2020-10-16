package view;
import model.Funcionario;
import model.Itens;
import model.PedidoBuilder;

public class Atendimento {

	
	 public static void main(String[] args) {
	
		Itens itens = new Itens();
		itens.setSanduiche("x-burguer");
		itens.setBatata("batata grande");
		itens.setBrinquedo("boneca");
		itens.setRefrigerante("coca-cola");
		
		Funcionario funcionario = new Funcionario("Fernanda");

		PedidoBuilder pedido = new PedidoBuilder();
		pedido.setFuncionario(funcionario);
		pedido.setItens(itens);
		
		pedido.dentroDaCaixa();
		pedido.foraDaCaixa();
		
		System.out.println(pedido);
	
	}
}

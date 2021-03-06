package model;
import java.util.ArrayList;
import java.util.List;


public class PedidoBuilder extends Pedido{

	private Funcionario funcionario;
	private Itens itens;
	private List<String> dentroDaCaixa = new ArrayList<String>();
    private List<String> foraDaCaixa = new ArrayList<String>();
	
    
	public PedidoBuilder() {
		super();
	}

	public PedidoBuilder(Funcionario funcionario, Itens itens) {
		super(funcionario, itens);
	}

	public void dentroDaCaixa() {
		dentroDaCaixa.add(itens.getSanduiche());
		dentroDaCaixa.add(itens.getBatata());
		dentroDaCaixa.add(itens.getBrinquedo());
	}
	
	public void foraDaCaixa() {
		foraDaCaixa.add(itens.getRefrigerante());
	}

	
	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Itens getItens() {
		return itens;
	}

	public void setItens(Itens itens) {
		this.itens = itens;
	}

	public List<String> getDentroDaCaixa() {
		return dentroDaCaixa;
	}

	public void setDentroDaCaixa(List<String> dentroDaCaixa) {
		this.dentroDaCaixa = dentroDaCaixa;
	}

	public List<String> getForaDaCaixa() {
		return foraDaCaixa;
	}

	public void setForaDaCaixa(List<String> foraDaCaixa) {
		this.foraDaCaixa = foraDaCaixa;
	}

	@Override
	public String toString() {
		
		return "Pedido Entregue : \n"
				+ " Responsável por Produzir o produto: " + funcionario 
				+ "\n Produtos na Caixa: " + dentroDaCaixa 
				+ "\n Produtos fora da Caixa: " + foraDaCaixa 
				+ "\n Alana's Burguer agradece a sua preferência!";
	}
	

	
	
}

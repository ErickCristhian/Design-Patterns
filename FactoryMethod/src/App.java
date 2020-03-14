
import javax.swing.JOptionPane;


public class App {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite seu nome:");
		String genero = JOptionPane.showInputDialog("Digite seu genero(m,f ou -):");
		
		FactoryPessoa fabrica = new FactoryPessoa();
		
		Pessoa p = fabrica.getPessoa(genero, nome);
		
		JOptionPane.showMessageDialog(null, p.saudacao());

	}
}

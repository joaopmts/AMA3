package Ex23;

import javax.swing.JOptionPane;

public class TestLog {

	public static void main(String[] args) {
		
		String escolha = JOptionPane.showInputDialog("Escolha entre 'console' e 'arquivo' ");
		new FactoryMethod(escolha);

	}
}

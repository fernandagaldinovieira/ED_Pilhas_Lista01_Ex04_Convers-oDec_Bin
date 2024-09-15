package view;

import controller.ConverteController;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		ConverteController converte = new ConverteController();
		
		int decimal = -1;
		
		while(decimal < 0 || decimal > 1000) {
			decimal = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro entre de 0 e 1000: "));
			if (decimal < 0 || decimal > 1000) {
				decimal = Integer.parseInt(JOptionPane.showInputDialog("Número Inválido. Digite um número inteiro entre de 0 e 1000: "));
			}
		}
		
		System.out.println(converte.decTobIn(decimal));
	}
}

package controller;

import br.edu.fateczl.pilhas.PilhaInt;

public class ConverteController {

		PilhaInt pilha = new PilhaInt();
		
		public String decTobIn(int decimal) {
			String binario = "";
			
			if (decimal == 0) {
				pilha.push(0);
			}
			
			if (decimal == 1) {
				pilha.push(1);
			}
			
			while (decimal > 0) {
				pilha.push(decimal % 2);
				decimal = decimal / 2;
			}
			
			while (!pilha.isEmpty()) {
				try {
					binario = binario + pilha.pop();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			return binario;
		}
}

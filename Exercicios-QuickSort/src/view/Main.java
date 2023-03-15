package view;

import javax.swing.JOptionPane;
import controller.QuickController;

public class Main {

	public static void main(String[] args) {

		int tam = Integer.parseInt(JOptionPane.showInputDialog("Digite um tamanho para o vetor: "));
		
		// Vetor para ordenar
		int vetor[] = new int[tam];

		for (int i = 0; i < tam; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para a posição do vetor: "));
		}

		QuickController.quickSort(vetor, 0, vetor.length - 1);
		
		for(int i = 0; i < tam; i++) {
			System.out.println("Vetor ordenado: "+vetor[i]);
		}
	}

}

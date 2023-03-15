package controller;

public class QuickController {

	public QuickController() {
		
	}
	
	// M�todo Quicksort
	public static void quickSort(int[] vetor, int esquerda, int direita) {
		if(esquerda < direita) {
			int p = particao(vetor, esquerda, direita);
			
			quickSort(vetor, esquerda, p);
			// Fixando o valor e pegando um novo pivot
			quickSort(vetor, p + 1, direita);
		}
	}
	
	// M�todo de parti��o
	static int particao(int [] vetor, int esquerda, int direita) {
		//Pegando o meio do vetor
		int meio = (int) (esquerda + direita) / 2;
		System.out.println(meio);
		// Pegando o pivot a partir da divis�o
		int pivot = vetor[meio];
		
		// percorrendo o vetor com os ponteiros
		int i = esquerda - 1;
		int j = direita + 1;
		while(true) {
			do {
				i++;
			} while(vetor[i] < pivot);
			do {
				j--;
			} while(vetor[j] > pivot);
			// Se os ponteiros se encontrarem, ir� come�ar a troca de valores
			if(i >= j) {
				return  j;
			}
			int aux = vetor[i];
			vetor[i] = vetor[j];
			vetor[j] = aux;
		}
	}

}

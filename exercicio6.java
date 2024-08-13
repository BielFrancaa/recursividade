package recursividade;

public class exercicio6 {
	    public static void inverterVetor(int[] vetor, int inicio, int fim) {
	        if (inicio >= fim) return;
	        int temp = vetor[inicio];
	        vetor[inicio] = vetor[fim];
	        vetor[fim] = temp;
	        inverterVetor(vetor, inicio + 1, fim - 1);
	    }
}

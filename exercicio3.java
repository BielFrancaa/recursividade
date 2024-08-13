package recursividade;

public class exercicio3 {
	    public static int contarPares(int[] vetor, int tamanho) {
	        if (tamanho == 0) return 0;
	        return (vetor[tamanho - 1] % 2 == 0 ? 1 : 0) + contarPares(vetor, tamanho - 1);
	    }
}


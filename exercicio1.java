package recursividade;

public class exercicio1 {
	    public static int multiplicacao(int A, int B) {
	        if (B == 0) return 0;
	        return A + multiplicacao(A, B - 1);
	    }
	}


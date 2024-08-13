package recursividade;

public class exercicio4 {
	    public static int fatorialDuplo(int N) {
	        if (N == 1) return 1;
	        return N * fatorialDuplo(N - 2);
	    }
}

package recursividade;

public class exercicio2 {
	    public static int restoDivisao(int dividendo, int divisor) {
	        if (dividendo < divisor) return dividendo;
	        return restoDivisao(dividendo - divisor, divisor);
	    }
	}


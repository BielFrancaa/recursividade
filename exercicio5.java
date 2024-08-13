package recursividade;

public class exercicio5 {
	    public static int mdc(int x, int y) {
	        if (x == y) return x;
	        if (x > y) return mdc(x - y, y);
	        return mdc(y, x);
	    }
}

package recursividade;

public class program {
	    public static void main(String[] args) {
	        //Multiplicação por somas sucessivas
	        int A = 5, B = 3;
	        int resultadoMultiplicacao = exercicio1.multiplicacao(A, B);
	        System.out.println("Multiplicação de " + A + " por " + B + ": " + resultadoMultiplicacao);

	        //  Resto da divisão por subtrações sucessivas
	        int dividendo = 13, divisor = 5;
	        int resultadoResto = exercicio2.restoDivisao(dividendo, divisor);
	        System.out.println("Resto da divisão de " + dividendo + " por " + divisor + ": " + resultadoResto);

	        //Contagem de números pares em um vetor
	        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	        int quantidadePares = exercicio3.contarPares(vetor, vetor.length);
	        System.out.println("Quantidade de números pares no vetor: " + quantidadePares);

	        // Fatorial duplo de um número ímpar
	        int N = 5;
	        int fatorialDuplo = exercicio4.fatorialDuplo(N);
	        System.out.println("Fatorial duplo de " + N + ": " + fatorialDuplo);

	        // Máximo divisor comum (MDC)
	        int x = 48, y = 14;
	        int mdc = exercicio5.mdc(x, y);
	        System.out.println("MDC de " + x + " e " + y + ": " + mdc);

	        // Inversão de um vetor
	        int[] vetorParaInverter = {0,1, 2, 3, 4, 5, 6, 7, 8, 9,10};
	        exercicio6.inverterVetor(vetorParaInverter, 0, vetorParaInverter.length - 1);
	        System.out.print("Vetor invertido: ");
	        for (int i : vetorParaInverter) {
	            System.out.print(i + " ");
	        }
	    }
	}


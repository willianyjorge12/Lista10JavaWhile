package exerciciosLista10;
import java.util.Scanner;
public class Ex09 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int valor;
	        int maior = Integer.MIN_VALUE;  // inicializa com o menor inteiro possível
	        int menor = Integer.MAX_VALUE;  // inicializa com o maior inteiro possível
	        boolean leuValor = false;       // flag para verificar se algum valor válido foi lido

	        System.out.println("Digite valores inteiros positivos (digite um valor negativo para parar):");

	        while (true) {
	            System.out.print("Valor: ");
	            valor = scanner.nextInt();

	            if (valor < 0) {
	                break;
	            }

	            leuValor = true;

	            if (valor > maior) {
	                maior = valor;
	            }

	            if (valor < menor) {
	                menor = valor;
	            }
	        }

	        if (leuValor) {
	            System.out.println("Maior valor informado: " + maior);
	            System.out.println("Menor valor informado: " + menor);
	        } else {
	            System.out.println("Nenhum valor positivo foi informado.");
	        }

	        scanner.close();
	    }
}

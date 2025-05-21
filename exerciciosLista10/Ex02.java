package exerciciosLista10;
import java.util.Scanner;
public class Ex02 {
	  public static void main(String[] args) {
	        int soma = 0;

	        for (int i = 2; i <= 500; i += 2) {
	            soma += i;
	        }

	        System.out.println("Somatório dos valores pares de 1 até 500: " + soma);
	    }
}

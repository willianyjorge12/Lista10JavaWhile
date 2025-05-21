package exerciciosLista10;
import java.util.Scanner;
public class Ex04 {
	  public static void main(String[] args) {
	        double totalGrains = 0;
	        double grainsOnSquare = 1; // 1 grão no primeiro quadro

	        for (int square = 1; square <= 64; square++) {
	            totalGrains += grainsOnSquare;
	            grainsOnSquare *= 2; // dobra a quantidade para o próximo quadro
	        }

	        System.out.println("Total de grãos de trigo no tabuleiro: " + totalGrains);
	    }
}

package exerciciosLista10;
import java.util.Scanner;
public class Ex07 {
	 // Método para calcular o fatorial de um número inteiro não negativo
    public static long fatorial(int n) {
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println("Fatorial dos números ímpares de 1 a 10:");

        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {  // verifica se o número é ímpar
                long fat = fatorial(i);
                System.out.println("Número: " + i + " | Fatorial: " + fat);
            }
        }
    }
}

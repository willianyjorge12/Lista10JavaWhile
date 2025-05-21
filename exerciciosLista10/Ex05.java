package exerciciosLista10;
import java.util.Scanner;
public class Ex05 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long somaFatoriais = 0;

        System.out.println("Digite 15 valores inteiros:");

        for (int i = 1; i <= 15; i++) {
            System.out.print("Valor " + i + ": ");
            int valor = scanner.nextInt();

            if (valor < 0) {
                System.out.println("Número negativo não tem fatorial. Será considerado 0 para o fatorial.");
            }

            // Calcula fatorial apenas se valor >= 0, senão considera 0
            long fat = (valor >= 0) ? fatorial(valor) : 0;
            somaFatoriais += fat;
        }

        System.out.println("Somatório dos fatoriais dos valores digitados: " + somaFatoriais);
        scanner.close();
    }

	private static long fatorial(int valor) {
		// TODO Auto-generated method stub
		return 0;
	}
}

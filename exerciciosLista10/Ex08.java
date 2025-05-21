package exerciciosLista10;
import java.util.Scanner;
public class Ex08 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        double areaTotal = 0;
	        String resposta;

	        do {
	            System.out.print("Digite o nome do cômodo: ");
	            String nome = scanner.nextLine();

	            System.out.print("Digite a largura do " + nome + ": ");
	            double largura = scanner.nextDouble();

	            System.out.print("Digite o comprimento do " + nome + ": ");
	            double comprimento = scanner.nextDouble();

	            double area = largura * comprimento;
	            System.out.printf("Área do %s: %.2f m²%n", nome, area);

	            areaTotal += area;

	            scanner.nextLine(); // Consumir o enter pendente

	            System.out.print("Deseja continuar calculando novos cômodos? (SIM/NAO): ");
	            resposta = scanner.nextLine().trim().toUpperCase();

	        } while (!resposta.equals("NAO"));

	        System.out.printf("Área total acumulada da residência: %.2f m²%n", areaTotal);
	        scanner.close();
	    }
}

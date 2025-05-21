package exerciciosLista10;
import java.util.Scanner;
public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;
        int contador = 0;

        while (true) {
            System.out.print("Digite um número positivo (ou negativo para sair): ");
            double valor = scanner.nextDouble();

            if (valor < 0) {
                break;
            }

            soma += valor;
            contador++;
        }

        if (contador > 0) {
            double media = soma / contador;
            System.out.println("Total do somatório: " + soma);
            System.out.println("Média aritmética: " + media);
            System.out.println("Total de valores lidos: " + contador);
        } else {
            System.out.println("Nenhum valor positivo foi digitado.");
        }

        scanner.close();
    }
}

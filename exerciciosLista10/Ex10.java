package exerciciosLista10;
import java.util.Scanner;
public class Ex10 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dividendo: ");
        int dividendo = scanner.nextInt();

        System.out.print("Digite o divisor: ");
        int divisor = scanner.nextInt();

        if (divisor == 0) {
            System.out.println("Erro: divisão por zero não é permitida.");
        } else {
            int quociente = 0;
            int restante = Math.abs(dividendo);
            int divisorAbs = Math.abs(divisor);

            // Subtrai o divisor do dividendo enquanto for possível
            while (restante >= divisorAbs) {
                restante -= divisorAbs;
                quociente++;
            }

            // Ajusta o sinal do quociente
            if ((dividendo < 0 && divisor > 0) || (dividendo > 0 && divisor < 0)) {
                quociente = -quociente;
            }

            System.out.println("Resultado da divisão inteira: " + quociente);
        }

        scanner.close();
    }
}

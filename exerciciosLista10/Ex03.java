package exerciciosLista10;
import java.util.Scanner;
public class Ex03 {
	public static void main(String[] args) {
        int contador = 1;

        while (contador < 200) {
            if (contador % 4 == 0) {
                System.out.println(contador);
            }
            contador++;
        }
    }
}

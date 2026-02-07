import java.util.Scanner;
import java.util.Random;

public class AdivinaNumero {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroSecreto = random.nextInt(10) + 1;
        System.out.print("Adivina un número del 1 al 10: ");
        int intento = scanner.nextInt();

        if (intento == numeroSecreto) {
            System.out.println("¡Has acertado!");
        } else {
            System.out.println("No es correcto. El número era " + numeroSecreto);
        }
    }
}
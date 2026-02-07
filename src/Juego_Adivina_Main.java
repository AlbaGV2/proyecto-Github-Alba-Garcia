import java.util.Random;
import java.util.Scanner;

public class AdivinarNumero {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroSecreto = random.nextInt(10) + 1;
        int intento = 0;

        while (intento != numeroSecreto) {
            System.out.print("Adivina el número (1-10): ");
            intento = scanner.nextInt();

            if (intento < numeroSecreto) {
                System.out.println("Demasiado bajo");
            } else if (intento > numeroSecreto) {
                System.out.println("Demasiado alto");
            }
        }

        System.out.println("¡Correcto! Has adivinado el número.");
        scanner.close();
    }
}
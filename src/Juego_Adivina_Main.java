import java.util.Scanner;
import java.util.Random;

public class AdivinaNumero {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroSecreto = random.nextInt(10) + 1;
        System.out.print("Adivina un numero del 1 al 10 RAPIDO!: ");
        int intento = scanner.nextInt();

        if (intento == numeroSecreto) {
            System.out.println("Genial!! Has acertado :)!");
        } else {
            System.out.println("Ohhh! El numero no es correcto...);
            System.out.println("El numero correcto era: " + numeroSecreto);
        }
    }
}
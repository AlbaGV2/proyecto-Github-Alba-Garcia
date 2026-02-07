import java.util.Scanner;
import java.util.Random;

public class AdivinaNumero {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroSecreto = random.nextInt(10) + 1;
        System.out.print("Adivina un numero del 1 al 10 RAPIDO!: ");
        int intento = scanner.nextInt();

        //Validar numero de intentos.
        if (intento < 1 || intento > 10) {
            System.out.println("Numero fuera de rango");
            return;

        //Si el numero se ha acertado
        if (intento == numeroSecreto) {
            System.out.println("Genial!! Has acertado :)!");
        //Si no se ha acertado
        } else {
            System.out.println("Ohhh! El numero no es correcto...);
            System.out.println("El numero correcto era: " + numeroSecreto);
        }    
            //Cierre de scanner
            scanner.close();
        }
    }
        
     
        

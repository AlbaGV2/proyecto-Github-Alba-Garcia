import java.util.Scanner;
import java.util.Random;

public class AdivinaNumero {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroSecreto = random.nextInt(10) + 1;
        System.out.print("RAPIDO! Adivina un numero del 1 al 10: ");
        int intento = scanner.nextInt();

        //variables
        int maxIntentos = 10;
        int intentosMinimos = 1;


       validarEntrada(intento, maxIntentos, intentosMinimos);

        //Si el numero se ha acertado
        if (intento == numeroSecreto) {
            System.out.println("Genial!! Has acertado! Gracias por jugar!:)!");
        //Si no se ha acertado
        } else {
            System.out.println("Ohhh! El numero no es correcto...");
            System.out.println("El numero correcto era: " + numeroSecreto);
        }    
            //Cierre de scanner
            scanner.close();
        }

        public static void validarEntrada(int intento, int maxIntentos, int intentosMinimos){
            //Validar numero de intentos.
            if (intento < intentosMinimos || intento > numMaxIntentos) {
                System.out.println("Numero fuera de rango");
                System.out.println("Introduce un numero del 1 al 10");
                return;
        }
    }
        
     
        

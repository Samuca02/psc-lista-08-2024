import java.util.Scanner;
public class Atv4Lista8 {    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();
        scanner.close();

        char resultado = verificarPositivoNegativo(numero);

        System.out.println("Resultado: " + resultado);
        scanner.close();
    }

    public static char verificarPositivoNegativo(double num) {
        if (num > 0) {
            return 'P'; // Positivo
        } else if (num == 0) {
            return 'N'; // Zero
        } else {
            return 'N'; // Negativo
        }
    }
}
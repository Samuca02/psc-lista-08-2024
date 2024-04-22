import java.util.Scanner;
public class Atv3Lista8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.print("Digite o terceiro número: ");
        double num3 = scanner.nextDouble();
        scanner.close();

        double soma = calcularSoma(num1, num2, num3);
        double media = calcularMedia(num1, num2, num3);

        System.out.println("A soma dos três números é: " + soma);
        System.out.println("A média dos três números é: " + media);
        scanner.close();
    }

    public static double calcularSoma(double a, double b, double c) {
        return a + b + c;
    }

    public static double calcularMedia(double a, double b, double c) {
        return (a + b + c) / 3;
    }
}
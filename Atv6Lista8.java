import java.util.Scanner;
public class Atv6Lista8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite a hora (0-23): ");
            int hora = scanner.nextInt();

            System.out.print("Digite os minutos (0-59): ");
            int minutos = scanner.nextInt();

            // Chamada da função para converter o horário
            String horarioFormatado = converterParaNotacao12Horas(hora, minutos);

            System.out.println("Horário convertido: " + horarioFormatado);

            System.out.print("Deseja converter outro horário? (S/N): ");
            String resposta = scanner.next().toUpperCase();
            if (resposta.equals("N")) {
                break;
            }
        }

        System.out.println("Obrigado por usar o conversor de horário!");
        scanner.close();
    }

    // Função para converter o horário
    public static String converterParaNotacao12Horas(int hora, int minutos) {
        String periodo;

        if (hora >= 0 && hora < 12) {
            periodo = "A.M.";
        } else {
            periodo = "P.M.";
            if (hora > 12) {
                hora -= 12;
            }
        }

        return hora + ":" + String.format("%02d", minutos) + " " + periodo;
    }
}
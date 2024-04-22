public class Atv5Lista8 {
        public static void main(String[] args) {
            double custoInicial = 100.0; // Exemplo de custo inicial
            double taxaImposto = 10.0; // Exemplo de taxa de imposto (10%)
    
            // Chamada da função somaImposto
            double custoComImposto = somaImposto(custoInicial, taxaImposto);
    
            System.out.println("Custo com imposto: R$" + custoComImposto);
        }
    
        // Função para calcular o custo com imposto
        public static double somaImposto(double custo, double taxaImposto) {
            // Calcula o valor do imposto
            double imposto = custo * (taxaImposto / 100.0);
    
            // Soma o imposto ao custo inicial
            double custoComImposto = custo + imposto;
    
            return custoComImposto;
        }
    }
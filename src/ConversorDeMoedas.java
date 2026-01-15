import java.util.Scanner;

public class ConversorDeMoedas {
    public static void main(String[] args) {
        System.out.println("Seja bem-vindo(a) ao conversor de moedas!");

        int opcao;
        CodigoMoeda moedaBase = null;
        CodigoMoeda moedaDestino = null;
        double valor;
        double resultado;

        Scanner scanner = new Scanner(System.in);
        ServicoDeCambio servico = new ServicoDeCambio();
        do {
            System.out.println("\n************** CONVERSOR DE MOEDAS ************** \n");
            System.out.println("Escolha a opção desejada: ");
            System.out.println("1) Real(BRL) -> Dólar(USD) ");
            System.out.println("2) Dólar(USD) -> Real(BRL) ");
            System.out.println("3) Real(BRL) -> Euro(EUR) ");
            System.out.println("4) Euro(EUR) -> Real(BRL)");
            System.out.println("5) Dólar(USD) -> Euro(EUR)");
            System.out.println("6) Euro(EUR) -> Dólar(USD)");
            System.out.println("0) Sair");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    moedaBase = CodigoMoeda.BRL;
                    moedaDestino = CodigoMoeda.USD;
                    break;

                case 2:
                    moedaBase = CodigoMoeda.USD;
                    moedaDestino = CodigoMoeda.BRL;
                    break;

                case 3:
                    moedaBase = CodigoMoeda.BRL;
                    moedaDestino = CodigoMoeda.EUR;
                    break;

                case 4:
                    moedaBase = CodigoMoeda.EUR;
                    moedaDestino = CodigoMoeda.BRL;
                    break;

                case 5:
                    moedaBase = CodigoMoeda.USD;
                    moedaDestino = CodigoMoeda.EUR;
                    break;

                case 6:
                    moedaBase = CodigoMoeda.EUR;
                    moedaDestino = CodigoMoeda.USD;
                    break;

                case 0:
                    System.out.println("Encerrando o conversor...");
                    break;

                default:
                    System.out.println("Por favor, escolha uma opção válida!");
                    continue; // mantém o loop; usar return encerraria o metodo.
            }

            if(opcao >= 1 && opcao <= 6 ) {
                System.out.println("Moeda para conversão: " + moedaBase);
                System.out.println("Moeda convertida: " + moedaDestino);
                System.out.print("Digite o valor para conversão: ");
                valor = scanner.nextDouble();

                try {
                    double taxa = servico.obterTaxa(moedaBase, moedaDestino);
                    resultado = valor * taxa;
                    System.out.println("Resultado: " + String.format("%.2f", resultado));
                } catch (RuntimeException e) {
                    System.out.println("Erro ao obter taxa de câmbio. Tente novamente.");
                }
            }

        } while (opcao != 0);

        scanner.close();
    }
}

import java.util.Scanner;

public class ConversorDeMoedas {
    public static void main(String[] args) {
        System.out.println("Seja bem-vindo(a) ao conversor de moedas!");

        int opcao;
        //int entradaDeDados;

        Scanner scanner = new Scanner(System.in);
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

           // Scanner scanner = new Scanner(System.in);
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Conversão BRL → USD selecionada.");
                    break;

                case 2:
                    System.out.println("Conversão USD -> BRL selecionada.");
                    break;

                case 3:
                    System.out.println("Conversão BRL -> EUR selecionada.");
                    break;

                case 4:
                    System.out.println("Conversão EUR -> BRL selecionada.");
                    break;

                case 5:
                    System.out.println("Conversão USD -> EUR selecionada.");
                    break;

                case 6:
                    System.out.println("Conversão EUR -> USD selecionada.");
                    break;

                case 0:
                    System.out.println("Encerrando o conversor...");
                    break;

                default:
                    System.out.println("Por favor, escolha uma opção válida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}

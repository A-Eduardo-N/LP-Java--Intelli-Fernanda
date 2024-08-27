import java.util.Scanner;

public class CulcladoraSimplesQ3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            // Exibe o menu de opções
            System.out.println("Escolha uma operação:");
            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Divisão");
            System.out.println("4. Multiplicação");
            System.out.println("0. Sair");

            // Lê a opção do usuário
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();

            // Verifica a opção e executa a operação correspondente
            switch (opcao) {
                case 1:
                    realizarSoma(scanner);
                    break;
                case 2:
                    realizarSubtracao(scanner);
                    break;
                case 3:
                    realizarDivisao(scanner);
                    break;
                case 4:
                    realizarMultiplicacao(scanner);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        // Fecha o scanner
        scanner.close();
    }

    //Metodo para realizar a multiplicação
    private static void realizarMultiplicacao(Scanner scanner) {
        System.out.print("Digite o primeiro número");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número");
        double num2 = scanner.nextDouble();
        double resultado = num1 * num2;
        System.out.printf("Resultado da Multiplicação: %.2f\n", resultado);
    }


    // Método para realizar a soma
    private static void realizarSoma(Scanner scanner) {
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        double resultado = num1 + num2;
        System.out.printf("Resultado da soma: %.2f\n", resultado);
    }

    // Método para realizar a subtração
    private static void realizarSubtracao(Scanner scanner) {
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        double resultado = num1 - num2;
        System.out.printf("Resultado da subtração: %.2f\n", resultado);
    }

    // Método para realizar a divisão
    private static void realizarDivisao(Scanner scanner) {
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        double resultado = num1 / num2;
        System.out.printf("Resultado da divisão: %.2f\n", resultado);

        // Verifica se o divisor é zero para evitar divisão por zero
        if (num2 == 0) {
            System.out.println("Erro: Divisão por zero não é permitida.");
        }
        


    }
}
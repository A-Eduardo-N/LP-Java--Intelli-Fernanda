import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Criação do Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar peso e altura ao usuário
        System.out.print("Digite o peso (em kg): ");
        double peso = scanner.nextDouble();
        System.out.print("Digite a altura (em metros): ");
        double altura = scanner.nextDouble();

        // Criar objeto Pessoa com os dados fornecidos
        Pessoa pessoa = new Pessoa(peso, altura);

        // Criar objeto CalculadoraIMC para calcular o IMC
        CalculadoraIMC calculadoraIMC = new CalculadoraIMC();
        double imc = calculadoraIMC.calcularIMC(pessoa);
        String classificacao = calculadoraIMC.classificarIMC(imc);

        // Exibir o resultado
        System.out.printf("Seu IMC é: %.2f\n", imc);
        System.out.println("Classificação: " + classificacao);

        // Fechar o scanner
        scanner.close();
    }
}
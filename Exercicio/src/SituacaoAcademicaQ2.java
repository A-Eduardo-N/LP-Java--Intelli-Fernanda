import java.util.Scanner;

public class SituacaoAcademicaQ2 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita o nome do aluno
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        // Solicita as notas do aluno
        System.out.print("Digite a nota da primeira prova: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a nota da segunda prova: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a nota da terceira prova: ");
        double nota3 = scanner.nextDouble();

        // Calcula a média
        double media = (nota1 + nota2 + nota3) / 3;

        // Determina a situação com base na média
        String situacao;
        if (media >= 70) {
            situacao = "Aprovado";
        } else if (media < 40) {
            situacao = "Reprovado";
        } else {
            situacao = "Na final";
        }

        // Exibe a média e sua situação
        System.out.println("Nome do aluno: " + nome);
        System.out.printf("Média: %.2f\n", media);
        System.out.println("Situação acadêmica: " + situacao);

        // Fecha o scanner
        scanner.close();
    }
}

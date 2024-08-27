import java.util.Scanner;
public class FolhaDePagamentoQ1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//classe parte do java.util para ler e analisar texto com base em padrões

        System.out.print("Digite a matrícula do funcionário: ");
        int matricula = scanner.nextInt();//inserir dado string
        scanner.nextLine();

        System.out.print("Digite o nome completo do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o salário bruto do funcionário: ");
        double salarioBruto = scanner.nextDouble();

        //aplicação de desconto de 15%
        double descontoINSS = salarioBruto * 0.15;


        double salarioLiquido = salarioBruto - descontoINSS;


        System.out.println("\nContracheque:");//"\n" é utilizado para pular uma linha no momento que ele aparece no codigo
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome completo: " + nome);
        System.out.println("Salário Bruto: R$ " + String.format("%.2f", salarioBruto));
        System.out.println("Desconto INSS: R$ " + String.format("%.2f", descontoINSS));
        System.out.println("Salário Líquido: R$ " + String.format("%.2f", salarioLiquido));//+ String.format("%.2f"...) serve para colocar o formato do texto string nesse caso no formato de adicionar as ultimas duas casas decimais significando valor monetario

        scanner.close();
    }
}

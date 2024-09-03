import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Funcionario f = new Funcionario();

        System.out.print("Digite o valor da hora trabalhada: R$ ");
        f. setValorHora(sc.nextDouble());

        System.out.print("Digite a quantidade de horas trabalhadas: ");
        f.setHorasTrabalhadas(sc.nextInt());

        f. calcularSalario();

        System.out.print ("O valor da hora: "+ f.getValorHora()+ " R$, trabalhando "+ f.getHorasTrabalhadas()+ "horas");

    }

}
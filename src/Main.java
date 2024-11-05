import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa p = new Professor("Petrôncio", 34, "História");
        Pessoa a = new Aluno("João", 20, "123123123");
        Disciplina d = new Disciplina();
        Pessoa c = new Coordenador("Marcos", 36, "todas");
        TransformaçãoPolimorfica e = new TransformaçãoPolimorfica();
        e.polimorfismo_interface((Explicacao) p);
        e.polimorfismo_interface((Explicacao) a);
        e.polimorfismo_interface((Explicacao) c);

        System.out.println("Digite o nome da disciplina:");
        d.setNome(sc.nextLine());
        d.cadastrarAluno((Aluno) a);
        d.ministrarDisciplina((Professor) p);
        System.out.println(d);

        System.out.println("---------------------------------");

        System.out.println("Informações do professor:");
        System.out.println(p);
        System.out.println("Informações do Aluno:");
        System.out.println(a);

    }
}
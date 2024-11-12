package model;

public class Aluno extends Pessoa implements Explicacao {
    private String matricula;

    public Aluno (){

    }

    public Aluno (String nome, int idade, String matricula){
        super(nome, idade);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public void explica() {
        System.out.println("Estou Estudando");
    }

    @Override
    public String toString() {
        return "model.Aluno{" +
                "matricula='" + matricula + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}

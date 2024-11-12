package model;

public class Professor extends Pessoa implements Explicacao {

    private String materia;

    public Professor (){

    }
    public Professor (String nome, int idade, String materia){
        super(nome, idade);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "model.Professor{" +
                "materia='" + materia + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    @Override
    public void explica() {
        System.out.println("Estou explicando a aula.");
    }
}

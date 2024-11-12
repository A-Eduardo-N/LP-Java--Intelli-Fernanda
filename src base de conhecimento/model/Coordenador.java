package model;

public class Coordenador extends Pessoa implements Explicacao {
    @Override
    public void explica() {
        System.out.println("Estou explicando o INOVA.");
    }

    public Coordenador(String nome, int idade, String materia) {
        super(nome, idade);
    }
}

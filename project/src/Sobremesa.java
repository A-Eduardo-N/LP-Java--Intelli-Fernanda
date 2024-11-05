public class Sobremesa extends Refeicao {
    public Sobremesa(String nome, TipoRefeicao tipoRefeicao) {
        super(nome, tipoRefeicao);
    }

    @Override
    public void preparar() {
        System.out.println("Preparando a sobremesa: " + getNome());
    }

    @Override
    public void servir() {
        System.out.println("Servindo a sobremesa: " + getNome());
    }
}


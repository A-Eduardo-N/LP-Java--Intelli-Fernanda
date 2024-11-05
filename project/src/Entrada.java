public class Entrada extends Refeicao implements PreparacaoRefeicao {
    public Entrada(String nome, TipoRefeicao tipoRefeicao) {
        super(nome, tipoRefeicao);
    }

    @Override
    public void preparar() {
        System.out.println("Preparando a entrada: " + getNome());
    }

    @Override
    public void servir() {
        System.out.println("Servindo a entrada: " + getNome());
    }

    @Override
    public void temperar() {
        System.out.println("Temperando a entrada: " + getNome());
    }

    @Override
    public void esquentar() {
        System.out.println("Esquentando a entrada: " + getNome());
    }
}


public class PratoPrincipal extends Refeicao implements PreparacaoRefeicao {
    public PratoPrincipal(String nome, TipoRefeicao tipoRefeicao) {
        super(nome, tipoRefeicao);
    }

    @Override
    public void preparar() {
        System.out.println("Preparando o prato principal: " + getNome());
    }

    @Override
    public void servir() {
        System.out.println("Servindo o prato principal: " + getNome());
    }

    @Override
    public void temperar() {
        System.out.println("Temperando o prato principal: " + getNome());
    }

    @Override
    public void esquentar() {
        System.out.println("Esquentando o prato principal: " + getNome());
    }
}

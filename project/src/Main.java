
public class Main {
    public static void main(String[] args) {

        Refeicao entrada = new Entrada("Salada de folhas", TipoRefeicao.VEGANA);
        Refeicao pratoPrincipal = new PratoPrincipal("Risoto de cogumelos", TipoRefeicao.TRADICIONAL);
        Refeicao sobremesa = new Sobremesa("Mousse de maracujá", TipoRefeicao.GLUTENFREE);


        Refeicao[] refeicoes = {entrada, pratoPrincipal, sobremesa};


        for (Refeicao refeicao : refeicoes) {
            System.out.println("\nPreparando a refeição: " + refeicao.getNome());
            refeicao.preparar();
            refeicao.servir();


            if (refeicao instanceof PreparacaoRefeicao) {
                PreparacaoRefeicao preparacao = (PreparacaoRefeicao) refeicao;
                preparacao.temperar();
                preparacao.esquentar();
            }
        }
    }
}

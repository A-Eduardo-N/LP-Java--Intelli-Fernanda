public abstract class Refeicao {
    private String nome;
    private TipoRefeicao tipoRefeicao;

    public Refeicao(String nome, TipoRefeicao tipoRefeicao) {
        this.nome = nome;
        this.tipoRefeicao = tipoRefeicao;
    }

    public String getNome() {
        return nome;
    }

    public TipoRefeicao getTipoRefeicao() {
        return tipoRefeicao;
    }

    public abstract void preparar();
    public abstract void servir();
}


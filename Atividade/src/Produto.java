class Produto implements Calculavel {
    private String nome;
    private double preco;
    private CategoriaProduto categoria;

    private double imposto, juros, lucro, desconto, manuseio;
    private int quantidade;
    public Produto(String nome, double preco, CategoriaProduto categoria, int quantidade ) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
        this.quantidade = quantidade;
    }

    @Override
    public double calcularImposto() {
        imposto = preco * 0.1;
        return imposto;
    }

    @Override
    public double calcularJuros() {
        return 0;
    }

    @Override
    public double calcularLucro() {
        lucro =preco * 0.15;
        return lucro;
    }

    @Override
    public double calcularDesconto() {
        desconto =preco * 0.15;
        return  desconto;
    }

    @Override
    public double calcularTaxaManuseio() {
        manuseio =preco * 0.05;
        return manuseio;
    }

    @Override
    public double calcularPrecoFinal() {
        return preco + calcularImposto() + calcularTaxaManuseio() - calcularDesconto() + calcularLucro();
    }

    @Override
    public double calcularTotal() {
        return calcularPrecoFinal();
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public CategoriaProduto getCategoria() {
        return categoria;
    }

    public double getJuros() {
        return juros;
    }

    public double getImposto() {
        return imposto;
    }

    public double getLucro() {
        return lucro;
    }

    public double getDesconto() {
        return desconto;
    }

    public double getManuseio() {
        return manuseio;
    }

    public double getQuantidade() {
        return quantidade;
    }
}

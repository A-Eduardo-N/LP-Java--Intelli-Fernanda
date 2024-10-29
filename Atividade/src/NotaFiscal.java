class NotaFiscal {
    private Cliente cliente;
    private Produto produto1, produto2, produto3;

    public void adicionaCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void adicionaProduto1(Produto produto) {
        this.produto1 = produto;
    }

    public void adicionaProduto2(Produto produto) {
        this.produto2 = produto;
    }

    public void adicionaProduto3(Produto produto) {
        this.produto3 = produto;
    }

    public void exibirNotaFiscal() {
        System.out.println("Nome do Cliente: " + cliente.getNome());
        System.out.println("Endereço: " + cliente.getEndereco());
        System.out.println("Produtos:");

        if (produto1 != null) {
            produto1.calcularDesconto();
            produto1.calcularImposto();
            produto1.calcularJuros();
            produto1.calcularLucro();
            produto1.calcularTaxaManuseio();

            System.out.println("- " + produto1.getNome() + " (Categoria: " + produto1.getCategoria() + ") - Preço: " + produto1.getPreco() +"- imposto:"+ produto1.getImposto() +"- Juros:" + produto1.getJuros()+"- Com Desconto:"+ produto1.getDesconto()+"-Lucro:" + produto1.getLucro()+"-Taxa de Manuseio:" + produto1.getManuseio()+"-Quantidade:"+ produto1.getQuantidade()+" - Total: " + produto1.calcularTotal());
        }
        if (produto2 != null) {
            produto2.calcularDesconto();
            produto2.calcularImposto();
            produto2.calcularJuros();
            produto2.calcularLucro();
            produto2.calcularTaxaManuseio();

            System.out.println("- " + produto2.getNome() + " (Categoria: " + produto2.getCategoria() + ") - Preço: " + produto2.getPreco() +"- imposto:"+ produto2.getImposto() +"- Juros:" + produto2.getJuros()+"- Com Desconto:"+ produto2.getDesconto()+"-Lucro:" + produto2.getLucro()+"-Taxa de Manuseio:" + produto2.getManuseio()+"-Quantidade:"+ produto2.getQuantidade()+" - Total: " + produto2.calcularTotal());
        }
        if (produto3 != null) {
            produto3.calcularDesconto();
            produto3.calcularImposto();
            produto3.calcularJuros();
            produto3.calcularLucro();
            produto3.calcularTaxaManuseio();

            System.out.println("- " + produto3.getNome() + " (Categoria: " + produto3.getCategoria() + ") - Preço: " + produto3.getPreco() +"- imposto:"+ produto3.getImposto() +"- Juros:" + produto3.getJuros()+"- Com Desconto:"+ produto3.getDesconto()+"-Lucro:" + produto3.getLucro()+"-Taxa de Manuseio:" + produto3.getManuseio()+"-Quantidade:"+ produto3.getQuantidade()+" - Total: " + produto3.calcularTotal());
        }
    }
}

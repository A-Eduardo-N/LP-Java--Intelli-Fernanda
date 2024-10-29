public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João Paulo", "Retão,012");
        Produto produto1 = new Produto("Televisor", 1200.00, CategoriaProduto.ELETRONICO, 1);
        Produto produto2 = new Produto("Mouse", 30.00, CategoriaProduto.COMPUTACAO, 2);
        Produto produto3 = new Produto("Caderno", 15.00, CategoriaProduto.PAPELARIA, 3);

        NotaFiscal notaFiscal = new NotaFiscal();
        notaFiscal.adicionaCliente(cliente);
        notaFiscal.adicionaProduto1(produto1);
        notaFiscal.adicionaProduto2(produto2);
        notaFiscal.adicionaProduto3(produto3);

        notaFiscal.exibirNotaFiscal();
    }
}
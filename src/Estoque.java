import java.util.List;
import java.util.ArrayList;

class Estoque {
    private List<Produto> produtos;

    public Estoque() {
        this.produtos = new ArrayList<>(); // Inicializa a lista de produtos
    }

    public void exibirPrecosComDesconto(double porcentagem) {
        for (Produto produto : produtos) {
            System.out.println(produto.getNome() + " com desconto: R$ " + produto.calcularDesconto(porcentagem));
        }
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(String nome) {
        produtos.removeIf(produto -> produto.getNome().equalsIgnoreCase(nome));
    }

    public void exibirProdutos() {
        for (Produto produto : produtos) {
            System.out.println("Produto: " + produto.getNome() + " - Preço: R$ " + produto.getPreco());
        }
    }
}

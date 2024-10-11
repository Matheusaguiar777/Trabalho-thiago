
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estoque estoque = new Estoque();

        while (true) {
            System.out.println("\n1. Adicionar Produto");
            System.out.println("2. Remover Produto");
            System.out.println("3. Exibir Preços com Desconto");
            System.out.println("4. Exibir Produtos");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.print("Digite o nome do produto: ");
                String nome = scanner.nextLine();

                System.out.print("Digite o preço do produto: ");
                double preco = scanner.nextDouble();
                scanner.nextLine(); 

                System.out.print("Digite o tipo do produto (1- Eletrônico / 2- Alimento): ");
                int tipo = scanner.nextInt();
                scanner.nextLine(); 

                Produto produto;
                if (tipo == 1) {
                    produto = new Eletronico(nome, preco);
                } else {
                    produto = new Alimento(nome, preco);
                }
                estoque.adicionarProduto(produto);
                System.out.println("Produto adicionado com sucesso!");

            } else if (opcao == 2) {
                System.out.print("Digite o nome do produto a ser removido: ");
                String nome = scanner.nextLine();
                estoque.removerProduto(nome);
                System.out.println("Produto removido com sucesso!");

            } else if (opcao == 3) {
                System.out.print("Digite a porcentagem de desconto: ");
                double porcentagem = scanner.nextDouble();
                estoque.exibirPrecosComDesconto(porcentagem);

            } else if (opcao == 4) {
                estoque.exibirProdutos();

            } else if (opcao == 5) {
                break;
            }
        }
        scanner.close();
    }
}

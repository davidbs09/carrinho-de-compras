import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        int opcao;

        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Adicionar item");
            System.out.println("2 - Listar itens");
            System.out.println("3 - Calcular valor total");
            System.out.println("4 - Remover item");
            System.out.println("0 - Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1: // Adicionar item
                    System.out.println("Nome do item:");
                    String nome = scanner.nextLine();
                    System.out.println("Preço do item:");
                    Double preco = scanner.nextDouble();
                    System.out.println("Quantidade do item:");
                    int quantidade = scanner.nextInt();
                    scanner.nextLine();
                    carrinho.adicionarItem(nome, preco, quantidade);
                    break;
                case 2: // Listar itens
                    carrinho.listarItens();
                    break;
                case 3: // Calcular valor total
                    carrinho.calcularValorTotal();
                    break;
                case 4: // Remover item
                    System.out.println("Nome do item a remover:");
                    String nomeRemover = scanner.nextLine();
                    carrinho.removerItem(nomeRemover);
                    break;
                case 0: // Sair
                    System.out.println("Saindo...");
                    break;
                default: // Opção inválida
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
        System.out.println("Sistema encerrado.");
    }
}

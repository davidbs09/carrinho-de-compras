import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        // Adicionando itens ao carrinho
        System.out.println("Informe o nome do Item para adicionar ao carrinho:");
        String nome = scanner.nextLine();
        System.out.println("Informe o preço do Item:");
        Double preco = scanner.nextDouble();
        System.out.println("Informe a quantidade do Item:");
        int quantidade = scanner.nextInt();
        carrinho.adicionarItem(nome, preco, quantidade);
        

        // Listando itens no carrinho
        carrinho.listarItens();

        // Calculando o valor total do carrinho
        carrinho.calcularValorTotal();

        // Removendo um item do carrinho
        System.out.println("Informe o nome do Item para remover do carrinho:");
        scanner.nextLine(); // Consumir a quebra de linha pendente
        String nomeRemover = scanner.nextLine();
        carrinho.removerItem(nomeRemover);
        scanner.close();

        // Listando itens novamente após remoção
        carrinho.listarItens();
    }
}

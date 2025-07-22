import java.util.List;
import java.util.ArrayList;

public class CarrinhoDeCompras {

    List<ItemCarrinho> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String nome, Double preco, int quantidade) {
        ItemCarrinho item = new ItemCarrinho(nome, preco, quantidade);
        this.itens.add(item);
    }

    public void removerItem(String nome) {
        for ( ItemCarrinho item : itens) {
            if (item.getNome().equals(nome)) {
                itens.remove(item);
                break;
            }
        }
    }

    public void calcularValorTotal() {
        Double valorTotal = 0.0;
        for (ItemCarrinho item : itens) {
            valorTotal += item.getPreco() * item.getQuantidade();
        }
        System.out.println("Valor total do carrinho: " + valorTotal);
    }

    public void listarItens() {
        if (itens.isEmpty()) {
            System.out.println("Carrinho vazio.");
        } else {
            System.out.println("Itens no carrinho:");
            for (ItemCarrinho item : itens) {
                System.out.println(item.getNome() + " - Preço: " + item.getPreco() + " - Quantidade: " + item.getQuantidade());
            }
        }
    }
}
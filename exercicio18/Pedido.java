package exercicio18;

public class Pedido {
    private int numeroPedido;
    private Cliente cliente;
    private ItemPedido[] itens;
    private int index;
    private String status;

    public Pedido(int numeroPedido, Cliente cliente) {
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.itens = new ItemPedido[20];
        this.index = 0;
        this.status = "ABERTO";
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void adicionarItem(ItemPedido item) {
        if (index < itens.length) {
            itens[index] = item;
            index++;
        } else {
            System.out.println("Pedido cheio. Limite de 20 itens atingido.");
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < index; i++) {
            total += itens[i].calcularSubtotal();
        }
        return total;
    }

    public String getDados() {
        String dados = "\nPedido: " + numeroPedido + "\n";
        dados += cliente.getDados() + "\n";

        for (int i = 0; i < index; i++) {
            dados += itens[i].getDados() + "\n";
        }

        dados += "Total: R$ " + calcularTotal() + "\n";
        dados += "Status: " + status + "\n";

        return dados;
    }
}
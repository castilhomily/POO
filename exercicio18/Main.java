package exercicio18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Pedido[] pedidos = new Pedido[100];
        int qtdPedidos = 0;

        int opcao;

        do {
            System.out.println("\n#### Bean & Code Café ####");
            System.out.println("[1] Registrar novo pedido");
            System.out.println("[2] Adicionar item a um pedido");
            System.out.println("[3] Finalizar pedido");
            System.out.println("[4] Listar pedidos em aberto");
            System.out.println("[5] Exibir faturamento do dia");
            System.out.println("[6] Sair");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    System.out.print("Número do pedido: ");
                    int numero = sc.nextInt();

                    boolean existe = false;
                    for (int i = 0; i < qtdPedidos; i++) {
                        if (pedidos[i].getNumeroPedido() == numero) {
                            existe = true;
                            break;
                        }
                    }

                    if (existe) {
                        System.out.println("Pedido já existe!");
                        break;
                    }

                    sc.nextLine();
                    System.out.print("Nome do cliente: ");
                    String nome = sc.nextLine();

                    System.out.print("CPF: ");
                    String cpf = sc.nextLine();

                    Cliente cliente = new Cliente(nome, cpf);
                    pedidos[qtdPedidos] = new Pedido(numero, cliente);
                    qtdPedidos++;

                    System.out.println("Pedido registrado!");
                    break;

                case 2:
                    System.out.print("Número do pedido: ");
                    int numBusca = sc.nextInt();

                    Pedido pedidoEncontrado = null;

                    for (int i = 0; i < qtdPedidos; i++) {
                        if (pedidos[i].getNumeroPedido() == numBusca) {
                            pedidoEncontrado = pedidos[i];
                            break;
                        }
                    }

                    if (pedidoEncontrado == null) {
                        System.out.println("Pedido não encontrado!");
                        break;
                    }

                    if (pedidoEncontrado.getStatus().equals("FINALIZADO")) {
                        System.out.println("Pedido já finalizado!");
                        break;
                    }

                    sc.nextLine();
                    System.out.print("Produto: ");
                    String produto = sc.nextLine();

                    System.out.print("Preço: ");
                    double preco = sc.nextDouble();

                    System.out.print("Quantidade: ");
                    int qtd = sc.nextInt();

                    ItemPedido item = new ItemPedido(produto, preco, qtd);
                    pedidoEncontrado.adicionarItem(item);

                    System.out.println("Item adicionado!");
                    break;

                case 3:
                    System.out.print("Número do pedido: ");
                    int numFinalizar = sc.nextInt();

                    Pedido pedidoFinal = null;

                    for (int i = 0; i < qtdPedidos; i++) {
                        if (pedidos[i].getNumeroPedido() == numFinalizar) {
                            pedidoFinal = pedidos[i];
                            break;
                        }
                    }

                    if (pedidoFinal == null) {
                        System.out.println("Pedido não encontrado!");
                        break;
                    }

                    if (pedidoFinal.getStatus().equals("FINALIZADO")) {
                        System.out.println("Pedido já finalizado!");
                        break;
                    }

                    pedidoFinal.setStatus("FINALIZADO");

                    System.out.println(pedidoFinal.getDados());
                    break;

                case 4:
                    boolean temAberto = false;

                    for (int i = 0; i < qtdPedidos; i++) {
                        if (pedidos[i].getStatus().equals("ABERTO")) {
                            System.out.println(pedidos[i].getDados());
                            temAberto = true;
                        }
                    }

                    if (!temAberto) {
                        System.out.println("Nenhum pedido em aberto no momento.");
                    }
                    break;

                case 5:
                    double faturamento = 0;

                    for (int i = 0; i < qtdPedidos; i++) {
                        if (pedidos[i].getStatus().equals("FINALIZADO")) {
                            faturamento += pedidos[i].calcularTotal();
                        }
                    }

                    System.out.println("Faturamento do dia: R$ " + faturamento);
                    break;

                case 6:
                    System.out.println("Sistema Bean & Code encerrado. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 6);

        sc.close();
    }
}
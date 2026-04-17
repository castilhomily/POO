package exercicio15;

import java.util.Scanner;


public class Main {
    static Scanner sc = new Scanner(System.in);
    static Veiculo[] veiculos = new Veiculo[10];
    static Registro[] registros = new Registro[20];
    static int indexVeiculo;
    static int indexRegistro;

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("""
                    #### Estacionamento ParkEasy ####
                    [1] Entrada de veículo
                    [2] Saída de veículo
                    [3] Imprimir veículos estacionados
                    [4] Imprimir a receita
                    [5] Finalizar
                    """);


            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> registrarEntrada();
                case 2 -> veiculosEstacionamento();
            }

        } while (opcao != 5);
    }
    public static void veiculosEstacionamento(){
        for (int i = 0; i < indexRegistro; i++){
            System.out.println(registros[i].veiculo.placa);
        }

    }

    public static void registrarEntrada(){
        String placa, marca, modelo;
        String nome;
        long cpf;
        String horaEntrada;
        Veiculo veiculo = pesquisar();

        if (veiculo == null) {
            System.out.println("Placa -->");
            placa = sc.next().toUpperCase();
            System.out.println("Modelo -->");
            modelo = sc.next();
            System.out.println("Marca -->");
            marca = sc.next();
            System.out.println("Nome do proprietario -->");
            nome = sc.next();
            System.out.println("CPF do proprietario -->");
            cpf = sc.nextLong();
            Proprietario proprietario = new Proprietario(nome, cpf);
            veiculos[indexVeiculo] = new Veiculo(placa,modelo,marca,proprietario);
            indexVeiculo++;
        }
        System.out.println("Hora de entrada (hh:mm) -->");
        horaEntrada = sc.next();
        registros[indexRegistro] = new Registro(veiculo, horaEntrada);
        indexRegistro++;

    }
    public static Veiculo pesquisar(){
        String placa;
        System.out.println("Placa para pesquisa -->");
        placa = sc.next().toUpperCase();
        for (int i = 0; i < indexVeiculo; i++) {
          if (veiculos[i].placa.equals(placa)) {
              return veiculos [i];
          }
        }
        System.out.println("Placa nao encontrada");
        return null;
    }
}






package exercicio17;

public class Main {
    public static void main(String[] args) {
        Departamento departamento = new Departamento("TI01", "TI");
        departamento.adicionarFuncionario(new Funcionario("01", "XX", "Diretor",85000));
        departamento.adicionarFuncionario(new Funcionario("02", "YY", "Gerente",30000));
        departamento.adicionarFuncionario(new Funcionario("03", "ZZ", "Estagiário",1500));

        // exibir dados do departamento
        System.out.println(departamento.exibirRelatoio());

        //deligar um funcionario
        departamento.removerFuncionario("02");

        
    }
}

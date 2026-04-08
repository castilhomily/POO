package exercicio17;

public class Departamento {
    private String codigo;
    private String nome;
    private Funcionario[] funcionarios;
    private int index;


    public Departamento(String codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
        this.index = 0;
        this.funcionarios = new Funcionario[5];

    }

    public void setFuncionarios(Funcionario f){
        if (index < funcionarios.length && f.isAtivo()){
            funcionarios[index++] = f;
        }
    }

    public double calcularFolhaTotalLiquida() {
        double total = 0;
        for (int i = 0; i < index; i++){
            if (funcionarios[i].isAtivo()){
                total += funcionarios[i].calcularSalarioLiquido();
            }
        }
        return total;
    }

    public int getTotalFuncionarioAtivos () {
        int total = 0;
        for (int i = 0; i < index; i++){
            if (funcionarios[i].isAtivo()){
                total++;
            }
        }
        return total;
    }

    public Funcionario buscarFuncionario (String matricula) {
        for (int i =0; i< index; i++){
            if (funcionarios [i].getMatricula().equalsIgnoreCase(matricula)){
                return funcionarios[i];

            }
        }
        return null;
    }

    public void removerFuncionario(String matricula){
        Funcionario aux= buscarFuncionario(matricula);
        if (aux != null) {
            aux.desligar();
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
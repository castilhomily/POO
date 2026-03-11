package Static;

public class SenhaAtendimento {
    String paciente;
    int senha;

    static int controle = 100; // para ver uma variavel unica precisa do static

    public SenhaAtendimento(String paciente){
        this.paciente = paciente;
        this.senha = controle++; //ou controle++;
    }

    public String getDados(){
        return "Paciente: " + paciente + " | Senha # " + senha;
    }

}

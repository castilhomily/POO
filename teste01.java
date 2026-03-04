import java.util.Scanner;
public class Aluno {

    String nome;
    String curso;
    int rm;
    double nota1;
    double nota2;

    public double calcularMedia() {
        double media = (nota1 + nota2) / 2;
        return media;
    }

    public String status() {
        double media = calcularMedia();
        if (media >= 6) {
            return "Aprovado";
        }
    }


    public static void main(String[] args) {
        Aluno a = new Aluno();
        Scanner sc = new Scanner(System.in);

        System.out.println("RM:");
        a.rm = sc.nextInt();
        System.out.println("nome:");
        a.rm = sc.nextInt();
        System.out.println("curso:");
        a.rm = sc.nextInt();
        System.out.println("nota 1:");
        a.rm = sc.nextInt();
        System.out.println("nota 2:");
        a.rm = sc.nextInt();

        System.out.println("media = " + a.calcularMedia());
        System.out.println("situação = " + a.status());




        System.out.println (a.rm);
    }
}

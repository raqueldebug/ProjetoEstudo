import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao menu principal!");
        TelaProfessor tp = new TelaProfessor();
        tp.acessar();

        TelaAluno ta = new TelaAluno();
        ta.acessar(tp.getAluno());
        System.out.println("----Area do aluno------\n");

    }
}
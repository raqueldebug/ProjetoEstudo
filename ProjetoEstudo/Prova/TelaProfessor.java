import java.util.Scanner;

public class TelaProfessor {

    private Professor professor = new Professor();
    private Aluno aluno = new Aluno();
    int codDig;
    int nota;
    int soma;
    int med;
    Scanner u = new Scanner(System.in);
    public void acessar() {

        System.out.println("Digite seu código de acesso: ");
        codDig = u.nextInt();
        do {
            if (codDig == professor.getMatricula()) {
                System.out.println("Digite o nome do aluno: ");
                String nomeAluno = u.next();
                aluno.setNome(nomeAluno);
                for (int cont = 1; cont < 4; cont++) {
                    System.out.println("Digite a º" + cont + " nota");
                    nota = u.nextInt();
                    soma += nota;
                }
                med = soma / 3;
                aluno.setMedia(med);
                System.out.println("A media do aluno " + nomeAluno + " é: " + med);

            } else {
                System.out.println("Prezado, código incorreto, tente novamnte");
            }
        } while (codDig != professor.getMatricula());
    }
    public Aluno getAluno() {
        return aluno;
    }
}

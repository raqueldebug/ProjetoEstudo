import java.util.Scanner;

public class TelaAluno {
    int codA = 321;
    Scanner u = new Scanner(System.in);
    public void acessar(Aluno aluno){
        System.out.println("Digite seu código de acesso: ");
        int codDig = u.nextInt();


        do{ if(codDig==codA){
            System.out.println("Caro aluno, para visualizar sua média digite sim");
            String sim =u.next();
            if(sim.equalsIgnoreCase(sim)){
                System.out.println("Sua média foi: "+ aluno.getMedia());
                if(aluno.getMedia() >5){
                    System.out.println("Você foia provado!");
                }else{
                    System.out.println("Você foi reprovado :-(");
                }
            }else {
                System.out.println("Cod incorreto");
            }}}while (codDig!=codA);

    }

}

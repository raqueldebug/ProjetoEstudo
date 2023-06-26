import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String simounao = "";

        Scanner in = new Scanner(System.in);
        //saudacao do banco
        do {
            System.out.println("Bem-vindo ao Banco R&R's \n");
            System.out.println("Deseja realizar transações bancárias em qual tipo de conta\n\n" +
                    "Escreva Jurídica ou Física");
            String tipoConta = in.next();
            if (tipoConta.equals("Jurídica")) {
                ContaJuridica inPj = new ContaJuridica(); //instanciei para PJ  que herdou Transações
                System.out.println("*Acesso para conta jurídica*");
                do {
                    System.out.println("Digite o seu CNPJ somente com números");//O cpnj já tem que ser cadastrado, por isso já deixei fixo
                    int cn = in.nextInt();
                    if (cn == inPj.getCnpj()) {


                        inPj.ExcTransacoes();

                    } else {
                        System.out.printf("CNPJ não cadastrado no sistema, deseja tentar novamente, sim ou não?");
                        simounao = in.next();
                    }
                } while (simounao.equalsIgnoreCase("sim"));


            }else if (tipoConta.equalsIgnoreCase("Física")) {
                    System.out.println("Acesso para conta física");


                    PessoaFisica inPF = new PessoaFisica();
                    inPF.ExcTransacoes();
                } else {
                    System.out.println("Opção incorreta, deseja tentar novamente, sim ou não?");
                    simounao = in.next();
                }

        } while (simounao.equals("sim"));


    }
}
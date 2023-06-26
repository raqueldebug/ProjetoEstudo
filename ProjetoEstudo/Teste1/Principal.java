import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner om = new Scanner(System.in);
        String continuar = null;
        String desc = "";

        Validador o = new Validador();
        //mensagem de apresentação
        o.MensgApre();

        //Aqui estou coletando os dados para cadastro do login  e coleta dos dados  para o acompanhamento
        o.Cadastro();
        System.out.println("Ótimo, cadastro conclído!! \nAgora realize o acesso\n ");

        do {
            System.out.println("Digite o login:");
            String nLogin = om.next();
            int senha = o.getSenha();
            String login = o.getLogin();


            System.out.println("Digite sua senha: ");
            int nSenha = om.nextInt();
            Validador i =new Validador();

            if (senha == nSenha && login.equals(nLogin)) {


                //aqui acompanha por 3 meses o trajetorio

                i.Tresmeses();


            } else {
                System.out.println("Deseja tentar novamente, digite sim ou não: ");
                desc = om.next();


            }
        } while (desc.equalsIgnoreCase("sim"));


    }
}
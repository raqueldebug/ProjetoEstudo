import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Utilidades utilidades = new Utilidades();
        Conta conta = new Conta();
        Assentos assentos = new Assentos();
        Scanner in = new Scanner(System.in);
        utilidades.PuladuasLinhas();
        System.out.println("Bem-vindo a Milhas Infinite ");
        utilidades.PuladuasLinhas();
        System.out.println("Vamos realizar seu cadastro!\nDigite seu nome: ");
        conta.nome = in.next();
        System.out.println("Digite sua idade: ");
        int idade = in.nextInt();

        utilidades.PuladuasLinhas();

        utilidades.PuladuasLinhas();
        Passagem passagem = new Passagem();
        assentos.MostrarAssentos();
        String EscolhaLado;
        System.out.println("Digite o lado que deseja comprar: ");
        EscolhaLado = in.next();

        if (EscolhaLado.equalsIgnoreCase("esquerdo")) {
            if (idade > 17) {
                conta.ContaAdulto();

                assentos.AssEsquerdo();
                passagem.CalculoValorAdulto();
                passagem.PagarPassagemAdulto();

            } else {
                conta.ContaCrianca();
                assentos.AssEsquerdo();
                passagem.CalculoValorCrianca();
                passagem.PagarPassagemCriaca();

            }
        } else if (EscolhaLado.equalsIgnoreCase("direito")) {
            if (idade > 17) {
                conta.ContaAdulto();

                assentos.AssentoDireito();
                passagem.CalculoValorAdulto();
                passagem.PagarPassagemAdulto();

            } else {
                conta.ContaCrianca();
                assentos.AssentoDireito();
                passagem.CalculoValorCrianca();
                passagem.PagarPassagemCriaca();

            }

        } else {
            System.out.println("Opção incorreta");
        }
    }


}


import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class Passagem {

    int PassagemAdulto = 100;
    int PassagemCrianca = 50;
    Passageiro passageiro = new Passageiro();
    //colocar dferenca de valor para idade
    Scanner in = new Scanner(System.in);
    Conta conta = new Conta();
    Assentos assentoEsquerdo = new Assentos();


    public void PagarPassagemAdulto() {


        if (ValoraPagar <= conta.saldoadulto) {
            System.out.println("Parabens pela sua compra! Valor total: " + ValoraPagar + "\nPara a data: 27/07/23");
            int saldoRestante = conta.saldoadulto - ValoraPagar;
            System.out.println("Saldo restante: " +saldoRestante);
        } else {

            System.out.println("Compra negada, saldo: "+conta.saldoadulto);
        }


    }

    public void PagarPassagemCriaca() {
        if (ValoraPagar <= conta.saldocriaca) {
            System.out.println("Parabens pela sua compra! Valor total: " + ValoraPagar + "\nPara a data: 27/07/23");
            int saldoRestante = conta.saldocriaca - ValoraPagar;
            System.out.println("Saldo restante: " +saldoRestante);
        } else {
            System.out.println("Compra negada, saldo: "+conta.saldocriaca);
        }
    }


    int ValoraPagar;

    public void CalculoValorAdulto() {
        System.out.println("Quantas passagens deseja comprar? ");
        int QuantasPassagens = in.nextInt();
        ValoraPagar = PassagemAdulto * QuantasPassagens;
    }

    public void CalculoValorCrianca() {
        System.out.println("Quantas passagens deseja comprar? ");
        int QuantasPassagens = in.nextInt();
        ValoraPagar = PassagemCrianca * QuantasPassagens;
    }

    public void VerificarIdadeeMostrarValoraSerPago() {
        System.out.println("Para confirmar passagem, digite 1 ou 2 para cancelar");
        int ConfirmarPassagem = in.nextInt();
        if (ConfirmarPassagem == 1) {
            System.out.println("Passageiro: " + passageiro.nome + ", valor a ser pago: " + ValoraPagar);
        } else {
            System.out.println("Obrigada pelo seu contato ótimo dia!\n----Encerrado----");

        }
    }

}

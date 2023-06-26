import java.util.Scanner;

public class Transacoes {


    int senha;
    String nome;
    int senhap;
    String nomep;

    private double saldoInical = 100;
    private double saldo;
    private double saldoinciailPoup = 0;
    Scanner in = new Scanner(System.in);

    public void cadastro() {
        System.out.println("Realize seu cadastro\n");
        System.out.println("Digite seu primeiro nome: ");
        nome = in.next();
        System.out.println("Crie sua senha com apenas 3 números: ");
        senha = in.nextInt();
    }

    public void acesso() {
        System.out.println("Digite seu primeiro nome: ");
        nomep = in.next();
        System.out.println("Digite sua senha com apenas 3 números: ");
        senhap = in.nextInt();
    }

    public void deposito() {
        System.out.println("Deseja realizar depósito em qual conta? Digite a opção desejada\n(1) Poupança\n(2) Conrrente");
        int es = in.nextInt();
        if(es==1){
            System.out.println("Qual valor do depósito?");
            double dep = in.nextDouble();
            if (dep > 0) {
                saldoinciailPoup = saldoinciailPoup + dep;


            } else {
                System.out.println("Valor deve ser acima de zero");
            }


            System.out.println("Depósito realizado com sucesso!!! Saldo da conta poupança: " + getSaldoinciailPoup());

        }else if(es==2){

            System.out.println("Qual valor do depósito?");
            double dep = in.nextDouble();
            if (dep > 0) {
                saldoInical = saldoInical + dep;

                saldoinciailPoup = saldoInical;
            } else {
                System.out.println("Valor deve ser acima de zero");
            }


            System.out.println("Depósito realizado com sucesso!!! Saldo da conta corrente: " + getSaldoInical());
        }


    }

    int x;

    public void menuPrinc() {

        do {
            System.out.println("--Menu Principal--");
            System.out.println("Digite a opção desejada\n(1) Depósito\n(2) Transferência\n(3) Saldo");
            int menuEsco = in.nextInt();
            switch (menuEsco) {
                case 1:
                    deposito();
                    break;
                case 2:
                    transferência();
                    break;
                case 3:
                    System.out.println("Digite\n(1) Saldo conta Poupança\n(2) Saldo conta Corrente");
                    int saldPoupa= in.nextInt();
                    if(saldPoupa==1) {
                        System.out.println("Saldo da conta Poupança: " + getSaldoinciailPoup());
                        break;}

                    else if(saldPoupa==2){
                        System.out.println("Saldo da conta Corrente: " + getSaldoInical());
                        break;
                    }


            }
            System.out.println("\nDeseja realiza outra operação?\nDigite a opção desejada\n(1) Retornar para menu principal\n(2) Encerrar");
            x = in.nextInt();
        } while (x == 1);
    }

    public void transferência() {


        System.out.println("Quanto vc gostaria de transferir? ");
        double valorTrans = in.nextDouble();
        if (valorTrans > 0) {
            setSaldoInical(saldoInical - valorTrans);


            System.out.println("Transferido com sucesso\nSaldo atualizado: " + getSaldoInical());

        } else {
            System.out.println("Ops..Saldo insuficiente");
        }


    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldoInical() {
        return saldoInical;
    }

    public void setSaldoInical(double saldoInical) {
        this.saldoInical = saldoInical;
    }

    public double getSaldoinciailPoup() {
        return saldoinciailPoup;
    }

    public void setSaldoinciailPoup(double saldoinciailPoup) {
        this.saldoinciailPoup = saldoinciailPoup;
    }
}

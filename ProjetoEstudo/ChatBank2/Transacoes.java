import java.util.Scanner;

//transação bancaria em um chat automatico
//criar no BD conta raquel e conta de origem

//nesta classe eu realizo apenas transferencia,deposito e saque
//primeira versao PFISICA
//depois tenho que criar mo BD as contas PJ e F
public class Transacoes {
    private Double saldo = 100.00;

    Scanner im = new Scanner(System.in);

    public void ExcTransacoes() {

        int login;
        int senha;
        String txtretorn;
        do {

            do {
                System.out.println("Para acessar sua conta digite seu login:");
                login = im.nextInt();
                System.out.println("Digite sua senha:");
                senha = im.nextInt();


                if (login == 123 && senha == 123) {

                    System.out.println("Escolha a opção desejada");
                    int ops;
                    do {
                        System.out.println("\nDigite 1 para verificar saldo");
                        System.out.println("Digite 2 para realizar transferência");
                        System.out.println("Digite 3 para realizar depósito");
                        System.out.println("Digite 4 para realizar saque");
                        ops = im.nextInt();
                        if (ops == 1) {
                            saldo();
                        } else if (ops == 2) {
                            //depois criar uma função para transferir esse valor pra outra conta n e importate agr
                            transferir();
                        } else if (ops == 3) {
                            deposito();
                        } else if (ops == 4) {
                            saque();
                       break; } else {
                            System.out.println("Opss...Escolha a opção correta do menu!\n");
                        }
                    } while (ops != 3 && ops != 1 && ops != 2);

                } else {
                    System.out.println("Opss...Login ou senha incorreto, tente novamente!\n");
                }

            } while (senha != 123 || login != 123);
            System.out.println("Caso deseje retornar ao menu escreva sim");
            txtretorn = im.next();
        } while (txtretorn.equals("sim"));
    }


    public void deposito() {
        System.out.println("Quanto deseja depositar? ");
        Double depos = im.nextDouble();
        if (saldo > 0) {
            this.saldo += depos;
            System.out.println("Depósito realizado com sucesso! Saldo atual: " + getSaldo());
        }


    }

    public void saldo() {
        System.out.println(getSaldo());
    }

    public void transferir() {
        System.out.println("Digite dados bancários com apenas números\nAgência: ");
        int ag = im.nextInt();
        System.out.println("Digite a conta: ");
        int conta = im.nextInt();
        System.out.println("Quanto deseja transferir? ");
        Double trans = im.nextDouble();
        if (trans > 0) {
            this.saldo -= trans;
            System.out.println("Transferencia realizada com sucesso! O saldo atual é de: " + getSaldo());

        } else {
            System.out.println("Saldo insuficiente");
        }

    }


    public void saque() {
        System.out.println("Quanto deseja sacar? ");
        Double saque = im.nextDouble();

        if (saque <= saldo) {
            this.saldo -= saque;

            System.out.println("Saque realizado com sucesso! O saldo atual é de: " + getSaldo());

        } else {
            System.out.println("Saldo insuficiente...");
        }


    }


    public Double getSaldo() {
        return saldo;
    }


}

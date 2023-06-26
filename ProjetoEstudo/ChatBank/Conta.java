
import javax.swing.JOptionPane;

import java.util.Scanner;

public class Conta {
    //criarei chat bancario para transações simples, deposito,saque,transferencia.

    private String banco;
    private int agencia;
    private int conta;


Scanner in= new Scanner(System.in);
    public Conta(String banco,int agencia,int conta){
        this.banco=banco;
        this.agencia=agencia;
        this.conta=conta;


    }




    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }
}

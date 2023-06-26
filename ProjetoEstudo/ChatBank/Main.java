import java.text.BreakIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int escolha = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Bem vido ao banco XX\n\n");

        Transacoes con = new Transacoes();

//deposito c c ou poupa
        con.cadastro();
int retorn;
        System.out.println("Cadastro efetuado\n");
    do {
        con.acesso();
        if (con.nome.equals(con.nomep) && con.senha == con.senhap) {
//MENU PARA INICAR TRANSAÇÕES
            con.menuPrinc();
        } else {
            System.out.println("Dados incorreto");
            System.out.println("Deseja tentar novamente? Digite 1 para sim 2 para não");
            escolha = in.nextInt();
        }

    } while (escolha == 1);



    }}
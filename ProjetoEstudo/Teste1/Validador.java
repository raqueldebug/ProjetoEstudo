import java.util.Scanner;

public class Validador {
    //registo de peso e evolução que teve -- calc pela altura e peso
    private String nome;
    private int idade;
    private String login;
    private int senha;
    private int peso;

    int pesoUm;
    int pesoDois;

    int pesoTres;
    int varpeso;

    Receitas dieta = new Receitas();
    int peso2;


    Scanner en = new Scanner(System.in);

    public Validador() {


    }


    public void MensgApre() {
        System.out.println("**fit 3 months**");


    }

    public static void main(String[] args) {

    }

    public void Cadastro() {
        System.out.println("\nPara realizar seu cadastro digite seu e-mail: ");
        login = en.next();


        System.out.println("Agora com até 3 números crie sua senha: ");
        senha = en.nextInt();


    }


    public void Tresmeses() {

//o valor não estava sendo impresso -- estudar herança


        System.out.println("Bem-vindo a página inicial, iremos acompanhar sua evolução fit para sua meta de peso");
        System.out.println("Digite sua altura: ");
        double altura = en.nextFloat();
        System.out.println("Digite seu peso atual: ");
        peso = en.nextInt();
        System.out.println("Digite seu peso desejado: ");
        int pesod = en.nextInt();

        int pesoIdeal = (int) ((altura * altura) * 22);


        System.out.println("Seu peso ideal é: " + pesoIdeal);

        System.out.println("\n*1º mês\nDigite seu peso: ");
        int peso1 = en.nextInt();


        if (peso1 == pesod) {
            System.out.println("meta atingida!!!");


        } else {
            System.out.println("Meta não atingida");
            dieta.pes(peso1);
        }


        if (peso1 != pesod) {
            System.out.println("\n*2º mês\nDigite seu peso: ");
            int peso2 = en.nextInt();
            if (peso2 == pesod) {
                System.out.println("meta atingida!!!");

            } else {
                System.out.println("Meta não atingida");
                dieta.pes(peso2);
            }
        }


        if (peso2 != pesod) {
            System.out.println("\n*3º mês\nDigite seu peso: ");
            int peso3 = en.nextInt();
            if (peso3 == pesod) {
                System.out.println("meta atingida!!!");

            } else {
                System.out.println("Meta não atingida");
                dieta.pes(peso3);
            }


        }
    }


//verificar como posso substituir a variavel peso para não precisar repetir a escrita


    public void AcessLogin(String login, int senha) {
        this.login = login;
        this.senha = senha;

    }


    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getLogin() {
        return login;
    }


    public int getSenha() {
        return senha;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }


}

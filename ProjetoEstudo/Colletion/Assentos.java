import java.util.ArrayList;
import java.util.Scanner;

public class Assentos {


    String AssentosEsquerdo;

    public void AssEsquerdo() {
        Passageiro passageiro = new Passageiro();
        Scanner in = new Scanner(System.in);

        String a = "A: 1,2,3";
        String b = "B: 4,5,6";
        String c = "C: 7,8,9";


        ArrayList<String> AssentosEsquerdo = new ArrayList<>();
        AssentosEsquerdo.add(a);
        AssentosEsquerdo.add(b);
        AssentosEsquerdo.add(c);
        Passagem passagem = new Passagem();
        int PoltronaEscolhida;

        System.out.println("Escolha qual posição deseja marcar digite primeiro a letra: ");
        String LetraEscolhida = in.next();

        switch (LetraEscolhida) {
            case "a":
                System.out.println(a);
                System.out.println("Agora escolha em qual poltrona dejesa sentar: ");
                PoltronaEscolhida = in.nextInt();

                System.out.println("Lado Esquerdo\nColuna: A\nPoltrona: " + PoltronaEscolhida);
                break;

            case "b":
                System.out.println(b);
                System.out.println("Agora escolha em qual poltrona dejesa sentar: ");
                PoltronaEscolhida = in.nextInt();
                System.out.println("Lado Esquerdo\nColuna: A\nPoltrona: " + PoltronaEscolhida);
                break;
            case "c":
                System.out.println(c);
                System.out.println("Agora escolha em qual poltrona dejesa sentar: ");
                PoltronaEscolhida = in.nextInt();
                System.out.println("Lado Esquerdo\nColuna: A\nPoltrona: " + PoltronaEscolhida);
                break;

        }
    }

    String AssentoDireito;

    public void AssentoDireito() {
        Passageiro passageiro = new Passageiro();
        Scanner in = new Scanner(System.in);


        String a = "A: 10,11,12";
        String b = "B: 13,14,15";
        String c = "C: 16,17,18";


        ArrayList<String> AssentoDireito = new ArrayList<>();
        AssentoDireito.add(a);
        AssentoDireito.add(b);
        AssentoDireito.add(c);

        System.out.println("Escolha qual posição deseja marcar digite primeiro a letra: ");
        String LetraEscolhida = in.next();
        int PoltronaEscolhida;
        switch (LetraEscolhida) {
            case "a":
                System.out.println(a);
                System.out.println("Agora escolha em qual poltrona dejesa sentar: ");
                PoltronaEscolhida = in.nextInt();
                System.out.println("Lado Esquerdo\nColuna: A\nPoltrona: " + PoltronaEscolhida);
                break;

            case "b":
                System.out.println(b);
                System.out.println("Agora escolha em qual poltrona dejesa sentar: ");
                PoltronaEscolhida = in.nextInt();
                System.out.println("Lado Esquerdo\nColuna: A\nPoltrona: " + PoltronaEscolhida);
                break;
            case "c":
                System.out.println(c);
                System.out.println("Agora escolha em qual poltrona dejesa sentar: ");
                PoltronaEscolhida = in.nextInt();
                System.out.println("Lado Esquerdo\nColuna: A\nPoltrona: " + PoltronaEscolhida);
                break;
        }
    }


    public void TesteMostrarAssento() {


    }

    public void MostrarAssentos() {

        //FAZER VARREDURA COM FOR




        System.out.println("Assentos do lado esquerdo:\nA: 1, 2, 3\nB: 4, 5, 6\nC: 7, 8, 9");
        System.out.println("Assentos do lado direito:\nA: 10,11,12\nB: 13,14,15\nC: 16,17,18");


    }
}
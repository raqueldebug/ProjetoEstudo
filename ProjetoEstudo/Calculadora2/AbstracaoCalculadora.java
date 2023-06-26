import java.util.Scanner;

abstract class AbstracaoCalculadora {
    Scanner in = new Scanner(System.in);
    //Aqui vou criar o tamplate e para ter acesso de instacia vou usar o static

    public static int valor1;
    public static int vaor2;
    public static int resultado;


    public void entradaValores() {
        System.out.println("Digite o primeiro valor: ");
        valor1 = in.nextInt();

        System.out.println("Digite o segundo valor: ");
        vaor2 = in.nextInt();
    }

    public static void LinhasPontilhadas() {
        System.out.println("========================================================");
    }

    public static void calculoSimples() {

        System.out.println("===================Calculadora simples=================");
        resultado = valor1 + vaor2;
        System.out.println("Resultado da soma: " + resultado);
        LinhasPontilhadas();

        if (valor1 > vaor2) {
            resultado = valor1 - vaor2;
            System.out.println("Resultado da subtração:  " + resultado);
        } else {
            resultado = vaor2 - valor1;
            System.out.println("Resultado da subtração:  " + resultado);
        }

        LinhasPontilhadas();

        resultado = valor1 / vaor2;
        System.out.println("Resultado da divisão: " + resultado);

        LinhasPontilhadas();

        resultado = valor1 * vaor2;
        System.out.println("Resultado da multiplicação:  " + resultado);


    }


}

public class CalculadoraCientifica extends AbstracaoCalculadora {

    @Override
    public void entradaValores() {
        super.entradaValores();
    }



    public void calculoCientifico() {

        System.out.println();
        System.out.println("\n\n===================Calculadora Cientifica=================");
        resultado = (int) Math.pow(valor1, vaor2);
        System.out.println("Resultado da potência:  " + resultado);
        LinhasPontilhadas();


        resultado = (int) Math. sqrt(valor1);
        System.out.println("Resultado da raiz quadrada do valor 1:  " + resultado);
        resultado = (int) Math. sqrt(vaor2);
        System.out.println("Resultado da raiz quadrada do valor 2:  " + resultado);

    }
}

public class Main {
    public static void main(String[] args) {

        CalculadoraCientifica calculadoraCientifica = new CalculadoraCientifica();

        calculadoraCientifica.entradaValores();
        AbstracaoCalculadora.calculoSimples(); //como estou usando STATIC NÃO FOI NECESSARIO INSTANCIAR
        calculadoraCientifica.calculoCientifico();


    }
}
public class Menu {

    /* Exercício: Aplicativo para Lanchonete
O seguinte aplicativo exibe um menu de uma lanchonete, com 3 tipos de comida e 3 tipos
de bebida.
O cliente escolhe o que quer comer e o programa retorna o valor total da conta. */
    public enum Comida {
        arroz, feijao, ovo;
    }
    public enum ComidaEnum {
        arroz(10),feijao(20),ovo(30);

        public int ValorComida;
        ComidaEnum(int valor) {
            ValorComida = valor;
        }
    }


    public enum OpcoesMenu {
        arroz(1), feijao(2), ovo(3);

        private final int valor;
        OpcoesMenu(int valorOpcao){
            valor = valorOpcao;
        }
        public int getValor(){
            return valor;
        }
    }


    public class TestadoraEnum {
        public static void escolheOpcao(OpcoesMenu opcao) {
            if (opcao == OpcoesMenu.arroz) {
                System.out.println("Prato escolhido: ARROZ\nValor: 10 reais");
            } else if (opcao == OpcoesMenu.feijao) {
                System.out.println("Prato escolhido: FEIJAO\nValor: 20 reais");
            } else if (opcao == OpcoesMenu.ovo) {
                System.out.println("Prato escolhido: OVO\nValor: 30 reais");
            }
        }


    }}


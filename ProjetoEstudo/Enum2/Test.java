
public class Test {

   EnumComida comida;
    EnumBebida bebida;

   Test() {
        this.comida = EnumComida.valueOf();
        this.bebida = EnumBebida.valueOf();

    }


    public void EscolherComida() {
        switch (comida) {

            case OVO:
                System.out.println("Valor do ovo: "+EnumComida.OVO);
                break;
            case ARROZ:
                System.out.println("Valor do arroz: ");
                break;
            case FEIJAO:
                System.out.println("Valor do feijão: ");
        }

    }

public void EscolherBebida(){
        switch (bebida){
            case MARACUJA:
                System.out.println("Valor do suco de maracuja: ");
                break;
            case UVA:
                System.out.println("Valor do suco de uva: ");
                break;
            case BETERRABA:
                System.out.println("Valor do suco de beterraba: ");
                break;
            default:
                System.out.println("Escolha incorreta");

        }




    }



}
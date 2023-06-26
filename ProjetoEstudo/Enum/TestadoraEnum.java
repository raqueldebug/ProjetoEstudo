public class TestadoraEnum extends Menu{
    public static void main(String[] args) {
        Menu.ComidaEnum arroz = Menu.ComidaEnum.arroz;
        Menu.ComidaEnum feijao = Menu.ComidaEnum.feijao;

        Menu menu = new Menu();
        OpcoesMenu.values();

        System.out.println("Nome da Marca = " + arroz.name());
        System.out.println("Nome da Marca = " + OpcoesMenu.values());
    }
}

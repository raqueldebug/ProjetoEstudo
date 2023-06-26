public class Receitas {

    public double basePeso;


    public double pes(double basePeso) {

        //laço de repetição para este bloco




        if (basePeso > 50) {
            System.out.println("Por favor, coma mais alimentos ricos em proteína como carne, peixe, ovos, leite, laticínios e grãos.");

        } else if (basePeso >= 50 && basePeso < 70) {
            System.out.println("Coma alimentos ricos em proteína, frutas, legumes, grãos e laticínios.");
        } else if (basePeso >= 70 && basePeso < 90) {
            System.out.println("Coma alimentos ricos em proteína, frutas, legumes, grãos, laticínios e alimentos saudáveis como nozes, sementes e azeite.");
        } else if (basePeso >= 90) {
            System.out.println("Coma alimentos ricos em proteína, frutas, legumes, grãos, laticínios, alimentos saudáveis e coma moderadamente alimentos com alto teor de gordura e açúcar.");
        }

        return basePeso;
    }
}

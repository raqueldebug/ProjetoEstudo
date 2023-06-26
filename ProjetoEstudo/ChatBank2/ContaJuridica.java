public class ContaJuridica extends Transacoes {

    private String razaoSocial = "Zag";
    private int cnpj = 123456789;

    Transacoes Pj = new Transacoes();



    public String getRazaoSocial() {
        return razaoSocial;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }
}



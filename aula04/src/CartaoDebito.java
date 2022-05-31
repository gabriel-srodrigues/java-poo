public class CartaoDebito {
    private String nomeTitular;
    private Integer diaValidade;
    private Integer mesValidade;
    private Double valorDaConta;

    public String getNomeTitular() {
        return nomeTitular;
    }

    public static CartaoDebito novoCartao(Double t) {
        return new CartaoDebito(t);
    };
    public CartaoDebito(Double valorDaConta) {
        this.valorDaConta = valorDaConta;
    }

    public void debitar(Double valor) {
        if (valor > this.valorDaConta) {
            System.out.println(
                    "\nOperação não concluida pois o valor " +
                            "informado é maior que o valor da conta, o valor é " + this.valorDaConta  + "\n");
        }else {
            this.valorDaConta = this.valorDaConta - valor;
        }
    }

    public CartaoDebito() {}

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public Integer getDiaValidade() {
        return diaValidade;
    }

    public void setDiaValidade(Integer diaValidade) {
        this.diaValidade = diaValidade;
    }

    public Integer getMesValidade() {
        return mesValidade;
    }

    public void setMesValidade(Integer mesValidade) {
        this.mesValidade = mesValidade;
    }

    public Double getValorDaConta() {
        return valorDaConta;
    }

    public void setValorDaConta(Double valorDaConta) {
        this.valorDaConta = valorDaConta;
    }
}

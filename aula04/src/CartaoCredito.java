public class CartaoCredito {
    private Double valorTotalCredito;
    private Double valorUtilizado;

    public static Double somaTodoValor(Double valorTotalCredito, Double valorUtilizado){
        return valorUtilizado + valorTotalCredito;
    }

    public Double getValorDisponivel() {
        return valorTotalCredito - valorUtilizado;
    }

    public Double getValorTotalCredito() {
        return valorTotalCredito;
    }

    public void setValorTotalCredito(Double valorTotalCredito) {
        this.valorTotalCredito = valorTotalCredito;
    }

    public Double getValorUtilizado() {
        return valorUtilizado;
    }

    public void setValorUtilizado(Double valorUtilizado) {
        this.valorUtilizado = valorUtilizado;
    }
}

import java.time.LocalDate;
import java.util.Scanner;

public class Impressora {
    private String fabricante;
    private LocalDate dataFabricacao;
    private String modelo;
    private String tipoImpressao;
    private Integer quantidadeFolhas;
    private Integer tempoDeVida;

    public Impressora(String fabricante,
                      LocalDate dataFabricacao,
                      String modelo,
                      String tipoImpressao,
                      Integer quantidadeFolhas,
                      Integer tempoDeVida) {
        this.fabricante = fabricante;
        this.dataFabricacao = dataFabricacao;
        this.modelo = modelo;
        this.tipoImpressao = tipoImpressao;
        this.quantidadeFolhas = quantidadeFolhas;
        this.tempoDeVida = tempoDeVida;
    }

    public Impressora(String fabricante, LocalDate dataFabricacao, String modelo) {
        this.fabricante = fabricante;
        this.dataFabricacao = dataFabricacao;
        this.modelo = modelo;

    }

    public Impressora(String fabricante) {
        this.fabricante = fabricante;
    }

    public Impressora(){}

    public boolean temFolhas() {
//        boolean temFolhas = this.quantidadeFolhas > 0;
//        return temFolhas;
        return this.quantidadeFolhas > 0;
    }

    public boolean impressaoRealizada(){
//        if (this.tempoDeVida < 2 || this.quantidadeFolhas < 1){
//            return false;
//        }

//        return this.tempoDeVida < 2 || this.quantidadeFolhas < 1;

        if (this.tempoDeVida < 2) {
            return false;
        }

        this.tempoDeVida = this.tempoDeVida - 2;

        if (this.quantidadeFolhas < 1) {
            return false;
        }
        this.quantidadeFolhas = this.quantidadeFolhas - 1;

        return true;
    }



    public String getFabricante() {
        return fabricante;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTipoImpressao() {
        return tipoImpressao;
    }

    public Integer getQuantidadeFolhas() {
        return quantidadeFolhas;
    }

    public Integer getTempoDeVida() {
        return tempoDeVida;
    }
}

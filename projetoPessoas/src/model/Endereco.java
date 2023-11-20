package projetoPessoas.src.model;

public class Endereco {

    private String rua;
    private String numeroDaRua;
    private String bairro;
    private String cidade;
    private String complemento;

    public Endereco () {}
  
    public Endereco (String rua, String numeroDaRua, String bairro, String cidade, String complemento) {
    this.rua = rua;
    this.numeroDaRua = numeroDaRua;
    this.bairro = bairro;
    this.cidade = cidade;
    this.complemento = complemento;
    }

//#region
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getNumeroDaRua() {
        return numeroDaRua;
    }
    public void setNumeroDaRua(String numeroDaRua) {
        this.numeroDaRua = numeroDaRua;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
//#endregion
}

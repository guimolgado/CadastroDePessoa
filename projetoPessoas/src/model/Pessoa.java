package projetoPessoas.src.model;

public class Pessoa {

    private String nome;
    private String cpf;
    private String numero;
    private String sexo;
    private Endereco endereco;




    //#region
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
//#endregion

public void seApresentar(String nome) {
    System.out.println("prazer, meu nome é " + this.getNome());
};
    

    public Pessoa () {}

    public Pessoa (String nome, String cpf, String numero, String sexo, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.numero = numero;
        this.sexo = sexo;
        this.endereco = endereco;
    }
}

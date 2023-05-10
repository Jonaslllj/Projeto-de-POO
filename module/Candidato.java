package ElementosUrna;

public class Candidato {
    private String c_numero;
    private String cpf;
    private String nome;
    private String hash;

    public Candidato(String c_numero, String cpf, String nome, String hash) {

    }

    public String getC_numero() {
        return c_numero;
    }

    public void setC_numero(String c_numero) {
        this.c_numero = c_numero;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getHash() {
        return hash;
    }

    public String getNome() {
        return nome;

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}

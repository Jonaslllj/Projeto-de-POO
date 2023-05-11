package module;

import java.security.NoSuchAlgorithmException;
import controller.HashGenerator;
import controller.iValidarCandidato;

public class Candidato extends Pessoa implements iValidarCandidato {
    private String c_numero;
    private String cpf;
    private String nome;
    private String hash;
 

    public Candidato(String c_numero, String cpf, String nome, String hash) throws Exception {
        super(nome, cpf, hash);
        this.c_numero = c_numero;

        if (!validarCand(c_numero, cpf, nome, hash)) {
            throw new Exception("Possivel adulteracao detectada: O hash atual é divergente do hash original");
        }
        ;
    
    } 
    public boolean validarCand(String c_numero,String cpf, String nome, String hash) {
        try {
            String tempHash = HashGenerator.generateHash(c_numero + cpf + nome);
            if (tempHash != hash) {
                return false;
            }
            return true;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return false;
        }
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

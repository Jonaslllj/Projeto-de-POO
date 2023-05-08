package ElementosUrna;

import java.security.NoSuchAlgorithmException;

public class Eleitor extends Pessoa implements iValidarLinha {
    private String e_numero;
    private String cpf;
    private String nome;
    private String senha;
    private final String hash;

    public String getHash() {
        return hash;
    }

    public Eleitor(String e_numero, String cpf, String nome, String senha, String hash) throws Exception {
        if (!validar(e_numero, cpf, nome, senha, hash)) {
            throw new Exception("Hackear-me-ao");
        }
        ;
        this.hash = hash;
        this.e_numero = e_numero;
        this.senha = senha;
        this.cpf = cpf;
    }

    public boolean validar(String e_numero, String cpf, String nome, String senha, String hash) {
        try {
            String tempHash = HashGenerator.generateHash(e_numero + cpf + nome + senha + hash);
            if (tempHash != hash) {
                return false;
            }
            return true;
        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
    }

    public boolean validar(String c_numero, String cpf, String nome, String hash) {
        return false;

    }
}


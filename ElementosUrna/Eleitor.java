package ElementosUrna;

import java.security.NoSuchAlgorithmException;

public class Eleitor extends Pessoa implements iValidarLinha{

    private String cpf;
    private String nome;
    private String senha;
    private boolean votou;
    private final String hash;

    public String getHash() {
        return hash;
    }

    public Eleitor(String cpf, String nome, String senha, boolean votou, String hash) throws Exception {
        if (!validar(cpf, nome, senha, votou, hash)) {
            throw new Exception("Hackear-me-ao");
        };
        this.cpf = cpf;
        this.nome = nome;
        this.senha = senha;
        this.votou = votou;
        this.hash = hash;
        }

    public boolean validar(String cpf, String nome, boolean votou, String senha, String hash) {
        try {
            String tempHash = HashGenerator.generateHash(cpf + nome + senha + votou + hash);
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

    public boolean validar(String cpf, boolean votou, String nome, String hash) {
        return false;

    }
    @Override
    public void setCpf(String cpf) {
        // TODO Auto-generated method stub
        super.setCpf(cpf);
    }
    @Override
    public String getCpf() {
        // TODO Auto-generated method stub
        return super.getCpf();
    }
    @Override
    public void setNome(String nome) {
        // TODO Auto-generated method stub
        super.setNome(nome);
    }
    @Override
    public String getNome() {
        // TODO Auto-generated method stub
        return super.getNome();
    }
   public void setSenha(String senha) {
       this.senha = senha;
   }
   public String getSenha() {
       return senha;
   }

@Override
public boolean validar(String cpf, String nome, String senha, boolean votou, String hash) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'validar'");
}
}


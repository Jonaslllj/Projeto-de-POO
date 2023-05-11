package module;

//import java.io.ObjectInputStream.GetField;
import java.security.NoSuchAlgorithmException;
import controller.HashGenerator;
import controller.iValidarEleitor;

public class Eleitor extends Pessoa implements iValidarEleitor {

    private boolean votou;

    public Eleitor(String cpf, String nome, boolean votou, String hash) throws Exception {
        
        super(cpf, nome, hash);
        this.votou = votou;

        // Uso do metodo de verificacao do eleitor
       
        if (! validarEle(cpf, nome, votou, hash)) {
            throw new Exception("Possivel adulteracao detectada: O hash atual é divergente do hash original");
        }
        ;
    }
    
    //O metodo abaixo serve para verificar possiveis fraudes durante a inicializacao do eleitor na memoria
    
    public boolean  validarEle(String cpf, String nome, boolean votou, String hash) {
        try {
            String tempHash = HashGenerator.generateHash(cpf + nome + votou);
            if (tempHash != hash) {
                return false;
            }
            return true;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return false;
        }
    }

    public String getHash() {
        return hash;
    }
    
    public void setVotou(boolean votou) {
        this.votou = votou;
    }

    public boolean getVotou() {
        return votou;

    }

    @Override
    public void setCpf(String cpf) {
        super.setCpf(cpf);
    }

    @Override
    public String getCpf() {
        return super.getCpf();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

}

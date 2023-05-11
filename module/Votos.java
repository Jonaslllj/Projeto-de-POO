package module;

import java.security.NoSuchAlgorithmException;
import controller.HashGenerator;

public class Votos extends Candidato{

    private long numeroVotos;
    
    public Votos(String c_numero, String cpf, String nome,long numeroVotos, String hash) throws Exception {
        super(c_numero, cpf, nome, hash);
        this.numeroVotos = numeroVotos;
        
        if (!validarVot(c_numero, numeroVotos, hash)) {
            throw new Exception("Possivel adulteracao detectada: O hash atual é divergente do hash original");
        }
        ;
    }
    public boolean validarVot(String c_numero, long numeroVotos, String hash) {
        try {
            String tempHash = HashGenerator.generateHash(c_numero + numeroVotos);
            if (tempHash != hash) {
                return false;
            }
            return true;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void addVoto(){
        numeroVotos += 1;
    }

    public long getNumeroVotos(){
        return numeroVotos;
    }
    
}

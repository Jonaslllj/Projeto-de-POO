package ElementosUrna;
public interface iValidarLinha {

    public interface ValidarLinha {
        public boolean validar(String c_numero, String cpf, String nome, String hash);
        public boolean validar(String e_numero, String cpf, String nome, String senha, String hash);
    }

}

package module;
public abstract class Pessoa {
	protected String nome;
	protected String cpf;
	protected String hash;

	public Pessoa(String nome, String cpf, String hash) {
		this.nome = nome;
		this.cpf = cpf;
		this.hash = hash;
	}
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
	public void setHash(String hash) {
		this.hash = hash;
	}
	public String getHash() {
		return hash;
	}
}

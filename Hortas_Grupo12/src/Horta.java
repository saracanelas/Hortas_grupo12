/**
 * 
 */

/**
 * 
 */
public class Horta {
	
	private String nome;
	private String local;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLocal() {
		return local;
	}

	public void imprimirDetalhes() {
		System.out.println("O nome da horta é" + nome);
	}
}

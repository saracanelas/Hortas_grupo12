
public class Ola {
	private int id;
	private String tipo;
	
	public Ola(int id, String tipo) {
		this.id = id;
		this.tipo = tipo;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Ola [id=" + id + ", tipo=" + tipo + "]";
	}
	public void imprimirId(int id) {
		System.out.println(id);
	}
}

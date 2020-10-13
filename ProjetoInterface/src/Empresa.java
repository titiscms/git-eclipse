
public class Empresa {
	
	// numero é um atributo e é semore utilizado com objeto. Ex: Integer
	private String nome;
	private Integer numero;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		
		// count é uma variavel e é utilizado com tipo primitivo Ex: int
		int count = 0;
		count++;
		
		System.out.println(count);
		
		this.numero = numero;
	}

}

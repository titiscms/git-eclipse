
public class Main {

	public static void main(String[] args) {
		
		ClienteDAO cliente = new ClienteOracleImpl();
		
//		System.out.println(cliente.nomeCliente("Thiago Costa"));
//		boolean isCLienteCadastrado = cliente.cadastrarCliente("Thiago Costa", "Titis");
//		boolean isCLienteExcluido = cliente.excluirCliente("Thiago Costa");
//		
//		if (isCLienteCadastrado) {
//			
//		}
//		
//		if (isCLienteExcluido) {
//			
//		}
		
		if(cliente instanceof ClienteOracleImpl) {
			System.out.println("OK");
			ClienteOracleImpl clienteSalvo = (ClienteOracleImpl) cliente;
			clienteSalvo.descricaoBancoOracle();
		} else if (cliente instanceof ClienteMySqlImpl) {
			cliente = (ClienteMySqlImpl) cliente;
			((ClienteMySqlImpl) cliente).descricaoBancoMySql();
		}
				
	}

}

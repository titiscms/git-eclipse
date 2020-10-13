
public class ClienteOracleImpl implements ClienteDAO, EmpresaDAO {

	@Override
	public Integer metodoCustomizado() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public String descricaoBancoOracle() {
		return "Oracle";
	}

	@Override
	public String teste() {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public String nomeCliente(String nome) {
//		return nome;
//	}
//
//	@Override
//	public Boolean cadastrarCliente(String nome, String apelido) {
//		System.out.println("Cliente cadastrado com sucesso:= " + nome + " Apelido:= " + apelido);
//		return true;
//	}
//
//	@Override
//	public boolean excluirCliente(String nome) {
//		System.out.println("Cliente excluído com sucesso:= " + nome);
//		return true;
//	}

}

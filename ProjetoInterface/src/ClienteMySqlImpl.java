
public class ClienteMySqlImpl implements ClienteDAO {

	@Override
	public Integer metodoCustomizado() {
		// TODO Auto-generated method stub
		return 1;
	}
	
	public String descricaoBancoMySql() {
		return "MySql";
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

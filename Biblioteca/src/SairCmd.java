
public class SairCmd implements Cmd {

	@Override
	public void executar(String usuario, String livro) {
		sair();
	}
	
	private void sair() {
		System.exit(0);
	}

}

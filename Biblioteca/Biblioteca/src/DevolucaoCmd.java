
public class DevolucaoCmd implements Cmd {

	@Override
	public void executar(String usuario, String livro) {
		
		Biblioteca blib = Biblioteca.obterInstancia();
		blib.devolver(usuario, livro);
		
	}

}


public class ReservaCmd implements Cmd {

	@Override
	public void executar(String usuario, String livro) {
		
		Biblioteca blib = Biblioteca.obterInstancia();
		blib.reservar(usuario, livro);
		
	}

}

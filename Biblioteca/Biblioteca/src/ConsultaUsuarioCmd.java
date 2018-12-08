
public class ConsultaUsuarioCmd implements Cmd {

	@Override
	public void executar(String usuario, String livro) {
		
		Biblioteca blib = Biblioteca.obterInstancia();
		blib.consultarUsuario(usuario);
		
	}

}

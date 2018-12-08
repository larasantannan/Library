
public class EmprestimoCmd implements Cmd {

	@Override
	public void executar(String usuario, String livro) {
		
		Biblioteca blib = Biblioteca.obterInstancia();
		blib.fazerEmprestimo(usuario, livro);
		
	}

}

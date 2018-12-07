
public class ConsultaLivroCmd implements Cmd {
	 
	@Override
	public void executar(String usuario, String livro) {
		livro = usuario;
		
		Biblioteca blib = Biblioteca.obterInstancia();
		blib.consultarLivro(livro);
	}

}
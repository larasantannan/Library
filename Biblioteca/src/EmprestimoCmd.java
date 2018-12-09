
public class EmprestimoCmd implements Cmd {

        //Estante estante;
        
	@Override
	public void executar(String usuario, String livro) {
		
		Biblioteca blib = Biblioteca.obterInstancia();
		blib.fazerEmprestimo(usuario, livro);
                
                //estante = Estante.obterInstancia();
                
                System.out.println("Oi");
		
	}

}

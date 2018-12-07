
public class Biblioteca {
	
	private static Biblioteca instancia;
	private Biblioteca() {}
	
	
	public static Biblioteca obterInstancia() {
		if (instancia == null) {
			instancia = new Biblioteca();
		}
		return instancia;
	}	
}

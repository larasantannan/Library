import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class IUSistema {

	private HashMap<String, Object> cmds = new HashMap<String, Object>();
	
	private void addCmds() {
		cmds.put("emp", new EmprestimoCmd());
		cmds.put("dev", new DevolucaoCmd());
		cmds.put("res", new ReservaCmd());
		cmds.put("obs", new ObservadorCmd());
		cmds.put("liv", new ConsultaLivroCmd());
		cmds.put("usu", new ConsultaUsuarioCmd());
		cmds.put("ntf", new NotificacaoCmd());
		cmds.put("sai", new SairCmd());
		
	}
	
	private static void tratarDados(String[] parametros) { // É assim que passa por referência em Java?
		System.out.println("Digite o comando desejado.\n"); // Apagar linha
		
		// Ler a entrada
		Scanner sc = new Scanner(System.in);
		String stringCmd;
		stringCmd = sc.nextLine();
		
		// Separa os comandos em uma lista de comandos
		List<String> listaParametros = new ArrayList<String>();
		StringTokenizer st = new StringTokenizer(stringCmd);
	    while (st.hasMoreTokens()) {
	    	listaParametros.add(st.nextToken());
	    }
	    
	    int i = 0;
	    for (Iterator iterator = listaParametros.iterator(); iterator.hasNext();) {
	    	parametros[i] = (String)iterator.next();
			i += 1;
		}
	}
	
	public static void main(String[] args) {
		String[] parametros;
	    parametros = new String[3];
	    parametros[0] = null;
	    parametros[1] = null;
	    parametros[2] = null;
	    
	    tratarDados(parametros);
	}
			
}

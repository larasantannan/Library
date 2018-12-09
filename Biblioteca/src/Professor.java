
public class Professor implements Usuario {
    
    private String id;
    private String nome;
    private int quantidadeReservas;
    private int notificacao;

    @Override
    public void update() {
        this.notificacao++;
    }  
}

package Biblioteca.src;

import java.util.ArrayList;


public class Livro implements SujeitoObservavel{

	private String id;
	private String titulo;
	private String editora;
	private String[] autores;
	private String edicao;
	private String anoPublicacao;
        private ArrayList observadores;
        private int quantidadeReservas;
	
	public Livro(String codigo, String titulo, String editora, String[] autores, String edicao, String anoPublicacao) {
		
		this.id = codigo;
		this.titulo = titulo;
		this.editora = editora;
		
		for (int i = 0; i < autores.length; i++) {
			this.autores[i] = autores[i];
		}
		
		this.edicao = edicao;
		this.anoPublicacao = anoPublicacao;
		
	}
	
	public String getId() {
		return this.id;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
        
        public void setQuantidadeReservas(){
            this.quantidadeReservas++;
            if(this.quantidadeReservas > 2){
                this.notificarObservador();
            }
        }
        
        public int getQuantidadeReservas(){
            return this.quantidadeReservas;
        }

    @Override
    public void addObservador(Usuario usuario) {
            observadores.add(usuario);
    }

    @Override
    public void removerObservador(Usuario usuario) {
        int i = observadores.indexOf(usuario);
		if (i >= 0) {
			observadores.remove(i);
                }
    }

    @Override
    public void notificarObservador() {
        for (int i = 0; i < observadores.size(); i++) {
            Usuario usuario = (Usuario)observadores.get(i);
		usuario.update();
	}
    }
}

	
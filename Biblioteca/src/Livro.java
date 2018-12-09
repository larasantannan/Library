package Biblioteca.src;

import java.util.ArrayList;


public class Livro{

	private String id;
	private String titulo;
	private String editora;
	private String autores;
	private String edicao;
	private String anoPublicacao;
        // private int quantidadeReservas;
	
	public Livro(String codigo, String titulo, String editora, String autores, String edicao, String anoPublicacao) {
		
		this.id = codigo;
		this.titulo = titulo;
		this.editora = editora;
		
		/*for (int i = 0; i < autores.length; i++) {
			this.autores[i] = autores[i];
		}*/
                this.autores = autores;
		
		this.edicao = edicao;
		this.anoPublicacao = anoPublicacao;
		
	}
	
	public String getId() {
		return this.id;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
       
}

	
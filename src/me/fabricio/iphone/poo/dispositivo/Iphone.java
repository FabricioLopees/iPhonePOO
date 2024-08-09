package me.fabricio.iphone.poo.dispositivo;

import me.fabricio.iphone.poo.aplicativos.*;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
	// AparelhoTelefonico métodos
	public void atender(){
		System.out.println("Atendendo ligação...");
	};
	
	public void ligar(String numero) {
		System.out.println("Ligando para "+numero+"...");
	}
	
	public void iniciarCorreioVoz(){
		System.out.println("Iniciando correio de voz...");
	};
	
	// NavegadorInternet métodos
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba...");
	}
	
	public void atualizarPagina() {
		System.out.println("Atualizando página...");
	}
	
	public void exibirPagina(String url) {
		System.out.println("Exibindo página correspondente a url "+url+"...");
	}
	
	// ReprodutorMusical métodos
	public void tocar() {
		System.out.println("Tocando música...");
	}
	
	public void pausar() {
		System.out.println("Pausando música...");
	}
	
	public void selecionarMusica(String musica) {
		System.out.println("Selecionando a música "+musica+"...");
	}
}
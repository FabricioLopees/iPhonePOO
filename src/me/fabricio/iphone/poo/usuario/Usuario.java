package me.fabricio.iphone.poo.usuario;

import me.fabricio.iphone.poo.dispositivo.Iphone;

public class Usuario{
	public static void main(String[] args) {
		
		Iphone meuCelular = new Iphone();
		
		// Executando métodos do reprodutor musical
		meuCelular.selecionarMusica("Rainha da Paz - Frei Gilson");
		meuCelular.tocar();
		meuCelular.pausar();
		
		System.out.println("-------------------------");
		
		// Executando métodos do aparelho telefônico
		meuCelular.iniciarCorreioVoz();
		meuCelular.ligar("(31)999999999");
		meuCelular.atender();
		
		System.out.println("-------------------------");
		
		// Executando métodos do navegador de internet
		meuCelular.exibirPagina("https://fabriciolopees.github.io/Portfolio");
		meuCelular.atualizarPagina();
		meuCelular.adicionarNovaAba();
	}
}
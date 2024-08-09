package me.fabricio.iphone.poo.aplicativos;

public interface NavegadorInternet{
	abstract void exibirPagina(String url);
	abstract void adicionarNovaAba();
	abstract void atualizarPagina();
}
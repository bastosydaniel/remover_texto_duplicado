package app;

import java.io.IOException;
import java.util.Scanner;

import tools.textCleaner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto = new String();
		Scanner scanner = new Scanner(System.in);
		String entrada = scanner.nextLine();

		texto = entrada;
		
		String textoTratado = new String();
		
		textoTratado = textCleaner.RemoverDuplicacaoPalavras(texto);
		
		System.out.println(textoTratado);

	}
}

package tools;

public class textCleaner {
	public static String removerDuplicacaoFinal(String texto)
	{
		String novoTexto = texto;
		if (texto.length() > 1 ) 
		{
			String sequencia = "";
			String pedacoDeAnalise = "";
			int inicioPedacoDeAnalise = 0; 
			for (int i = texto.length() - 1; i >= 0 ; i--) {
				sequencia = texto.charAt(i) + sequencia;
				
				if (sequencia.length() <= (texto.length()/2))
				{
					inicioPedacoDeAnalise =  texto.length() - (sequencia.length() * 2) ;			
					pedacoDeAnalise = texto.substring( inicioPedacoDeAnalise, inicioPedacoDeAnalise + sequencia.length());
					if (sequencia.equals(pedacoDeAnalise))
					{
						novoTexto = texto.substring( 0, inicioPedacoDeAnalise + sequencia.length());
						i = -1;
					}
				}
				else
				{
					i = -1;
				}
			}
		}
		
		return novoTexto;
	}
	public static String removerVerificarDuplicacaoFinal(String texto)
	{
		String textoLimpo = "";
		String palavras[] = texto.split(" ");
		String palavrasLimpas[] = new String[palavras.length];

		for (int i = 0; i < palavras.length; i++) 
		{
			palavrasLimpas[i] = removerDuplicacaoFinal(palavras[i]);
			textoLimpo += " " + palavrasLimpas[i];
		}
		
		
		boolean TodasPalavrasTinhamDuplicacao = true;

		for (int i = 0; i < palavras.length; i++) 
		{	
			TodasPalavrasTinhamDuplicacao = palavras[i].equals(palavrasLimpas[i]) ? false : TodasPalavrasTinhamDuplicacao;
		}
		
		return  TodasPalavrasTinhamDuplicacao? textoLimpo : texto;
	}
	
	public static String RemoverDuplicacaoPalavras(String texto)
	{
		String fraseLimpa = new String();
		
			fraseLimpa = removerVerificarDuplicacaoFinal(texto);
		
		
		return fraseLimpa;
	}
	
}

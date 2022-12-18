package com.forca.bruta;

public class ForcaBruta {
	public static void executar(String texto, String padrao) {
	    if (padrao == null || padrao.length() == 0)
	    {
	        System.out.println("O padrão é nulo ou não foi encontrado no texto.");
	        return;
	    }

	    if (texto == null || padrao.length() > texto.length())
	    {
	        System.out.println("Padrão não encontrado no texto.");
	        return;
	    }

	    char[] caracteresPadrao = padrao.toCharArray();

	    int[] proximoCorrespondente = new int[padrao.length() + 1];
	    for (int i = 1; i < padrao.length(); i++)
	    {
	        int j = proximoCorrespondente[i + 1];

	        while (j > 0 && caracteresPadrao[j] != caracteresPadrao[i]) {
	            j = proximoCorrespondente[j];
	        }

	        if (j > 0 || caracteresPadrao[j] == caracteresPadrao[i]) {
	        	proximoCorrespondente[i + 1] = j + 1;
	        }
	    }

	    for (int i = 0, j = 0; i < texto.length(); i++)
	    {
	        if (j < padrao.length() && texto.charAt(i) == padrao.charAt(j))
	        {
	            if (++j == padrao.length()) {
	                System.out.println("Padrão encontrado e inicando no caractere "+ (i - j + 1) + " do texto");
	            }
	        }
	        else if (j > 0)
	        {
	            j = proximoCorrespondente[j];
	            i--;
	        }
	    }
	}
}

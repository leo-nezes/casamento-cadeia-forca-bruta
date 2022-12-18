package com.forca.bruta;

public class Programa {

	public static void main(String[] args) {
		String text = "Aenean sed nunc elit. Sed sit amet tincidunt elit. Vivamus bibendum, lectus ut ultricies ornare, lorem tortor cursus dolor, vestibulum pulvinar neque sapien sit amet ex.";
        String pattern = "sed";
 
        long inicio = System.currentTimeMillis();
        ForcaBruta.executar(text, pattern);
        long duracao = System.currentTimeMillis() - inicio;
        
        System.out.println(inicio);
        System.out.println(duracao);

	}

}

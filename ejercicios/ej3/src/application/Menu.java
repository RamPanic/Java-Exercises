/*
 
 Me levanté de mala gana, así que hice todo en el propio módulo del menú,,,,
 ajá, estará casi todo mal hecho, pero prometo que en la próxima, estaré
 con más ganas para hacer las cosas :D
  
*/

package application;

public class Menu {

	String text;
	Input input;
	
	public Menu() {
	
		text = null;
		input = new Input();
	
	}

	public void display() {
		
		String option;
		
		do {

			showText();
			
			option = input.setInputString("Ej3(module/superMejoradoxd)> ");

			if (option.equals("start")){
				
				// Acá empieza la verdadera mierda de estos programas bum bam
				
				start();

			} else if (!option.equals("exit")) {
				
				System.out.println("No existe tal opción");

			}
			
		} while(!option.equals("exit"));

		input.close();

	}
	
	private void showText() {
		
		text = "Palabras tontas o no sé qué :P\n\n";
		
		System.out.println(text);
		
	}
	
	private void start() {
		
		int x, CANT = 2;
		String word; String[] words = new String[CANT];
		
		// Haré solo dos, no me jodan :P
		
		for (x = 0; x < CANT; x++) {
			word = input.setInputString("Palabra: ");
			words[x] = word;
		}
		
		// La última palabra de testeo, en serio, no más jodas estúpidas xd
		
		word = input.setInputString("Última palabra: ");
		
		boolean encontrado = false;
		
		for (String w: words) {
			if (w.equals(word)) {
				encontrado = true;
				// Esto es una porquería, no es la forma, podría hacerlo con un while
				// pero no tengo ganas de escribir mucho, sin embargo, lo haré más abajo...
				break;
			}
		}
		
		if (encontrado) {
			System.out.println("PALABRA ENCONTRADA :P");
		}
		
	}

}

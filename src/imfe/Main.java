package imfe;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Pedimos los datos necesarios para "crear" un objeto de la clase MaquinaChicles
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Que ID tiene la nueva máquina?: ");
		String id = teclado.nextLine();
		System.out.println("¿Cuántos chicles podrá tener como máximo?");
		int capacidadMaxima = teclado.nextInt();
		
		//Creamos el objeto
		MaquinaChicles maquina = new MaquinaChicles(id, capacidadMaxima);
		
		//Mostramos SOLO la ID usando su getter
		System.out.println("La máquina tiene la id " + maquina.getId().toUpperCase());
		System.out.println("Stock: " + maquina.getStock());
		
		maquina.setId("04-Carrefour");
		maquina.hacerMantenimiento();
		maquina.setStock(20); //No me dejaría ponerle un stock negativo ni mayor que su capacidad máxima. No daría error, pero ignoraría la orden.
		
		
	}

}
package imfe;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Pedimos los datos necesarios para "crear" un objeto de la clase MaquinaChicles
		Scanner teclado = new Scanner(System.in);
		System.out.println("�Que ID tiene la nueva m�quina?: ");
		String id = teclado.nextLine();
		System.out.println("�Cu�ntos chicles podr� tener como m�ximo?");
		int capacidadMaxima = teclado.nextInt();
		
		//Creamos el objeto
		MaquinaChicles maquina = new MaquinaChicles(id, capacidadMaxima);
		
		//Mostramos SOLO la ID usando su getter
		System.out.println("La m�quina tiene la id " + maquina.getId().toUpperCase());
		System.out.println("Stock: " + maquina.getStock());
		
		maquina.setId("04-Carrefour");
		maquina.hacerMantenimiento();
		maquina.setStock(20); //No me dejar�a ponerle un stock negativo ni mayor que su capacidad m�xima. No dar�a error, pero ignorar�a la orden.
		
		
	}

}
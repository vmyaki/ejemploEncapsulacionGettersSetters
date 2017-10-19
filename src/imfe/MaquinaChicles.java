package imfe;

public class MaquinaChicles {
	//Atributos
	private String id;
	private int maximo;
	private int monedas;
	private int stock;
	
	//Constructores
	public MaquinaChicles(String id, int maximo) {
		this.id = id;
		this.maximo = maximo;
		this.monedas = 0;
		this.stock = maximo;
	}
	
	//Métodos
	public void meterMoneda() {
		if (this.stock > 0) {
			this.monedas++;
			this.stock--;
		} else {
			System.out.println("No hay chicles. Lo siento");
		}
	}
	
	public void retirarDinero() {
		this.monedas = 0;
	}
	
	public void hacerMantenimiento() {
		System.out.println("Iniciando mantenimiento de la máquina '" + this.id + "'....");
		System.out.println("Debemos reponer " + (this.maximo - this.stock) + " chicles");
		System.out.println("Hay " + this.monedas + " monedas");
		this.stock = this.maximo;
		this.retirarDinero();
		System.out.println("Stock actual chicles: " + this.stock);
		System.out.println("Monedas actuales    : " + this.monedas);
		System.out.println("Mantenimiento realizado correctamente");
	}
	
	public String getId() {
		return this.id;
	}
	
	public void setId(String id) {
		if (id.length() > 0) { //Si la cadena no está vacia, lo actualizamos
			this.id = id;
		}
	}
	
	public void setStock(int stock) {
		//Nos aseguramos de que no nos introduzcan un stock no válido
		if (stock >=0 && stock <= this.maximo) {
			this.stock = stock;
		}
	}
	
	public int getStock() {
		return this.stock;
	}
	
	
	
}
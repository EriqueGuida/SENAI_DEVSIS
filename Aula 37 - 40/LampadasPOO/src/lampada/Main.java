package lampada;

public class Main {

	public static void main(String[] args) {
		Lampada lampada1 = new Lampada("Marca 1", "LED", 100, 5, 3.7);
		Lampada lampada2 = new Lampada("Marca 2", "Incandecente", 60, 10, 2);
		Lampada lampada3 = new Lampada();
		
		lampada1.exibirDados();
		lampada2.exibirDados();
		lampada3.exibirDados();
		
		lampada1.ligar();
		lampada1.mostrarEstado();
		
		lampada1.ligar();
		lampada1.mostrarEstado();
		
		lampada1.desligar();
		lampada1.mostrarEstado();
	}

}

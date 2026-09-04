package horario;

public class Horario {
	int hora, minuto, segundo;
	
	// Constructors
	public Horario() {
		super();
		this.hora = 0;
		this.minuto = 0;
		this.segundo = 0;
	}
	
	public Horario(int hora, int minuto, int segundo) {
		super();
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	
	// Métodos
	public void exibir() {
		System.out.printf("\n%02d:%02d:%02d\n", hora, minuto, segundo);
	}
	
	public  int calcularSegundos(){ 
		return ((hora * 3600) + (minuto * 60) + segundo);
	}
	
	
	// Getters e Setters
	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		if (this.hora >= 24 || this.hora < 0) System.out.println("Hora Inválida");
		this.hora = hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		if (this.minuto >= 60 || this.minuto < 0) System.out.println("Minuto Inválido");
		this.minuto = minuto;
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		if (this.segundo >= 60 || this.segundo < 0) System.out.println("Segundo Inválido");
		this.segundo = segundo;
	}
	
	
}

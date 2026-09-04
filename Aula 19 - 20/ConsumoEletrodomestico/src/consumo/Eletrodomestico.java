package consumo;

public class Eletrodomestico {
	String nome;
	double potenciaWatts, horasPorDia;
	
	// Constructor
	public Eletrodomestico(String nome, double potenciaWatts, double horasPorDia) {
		this.nome = nome;
		this.potenciaWatts = potenciaWatts;
		this.horasPorDia = horasPorDia;
	}
	
	public Eletrodomestico() {
		this.nome = "";
		this.potenciaWatts = 0;
		this.horasPorDia = 0;
	}
	
	
	// Methods
	public double consumoDiarioWh() {
		return potenciaWatts * horasPorDia;
	}
	
	public double consumoMensalWh() {
		return (potenciaWatts * horasPorDia) * 30;
	}
	
	public double consumoAnualWh() {
		return ((potenciaWatts * horasPorDia) * 30) * 12;
	}
	
	public double gastoMensal(double precoKwh) {
		return (consumoMensalWh() / 1000) * precoKwh;
	}
	
	public void exibirRelatorio(double precoKwh) {
		System.out.println(
				"\nDados do Eletrodoméstico:\n" +
				"Nome: " + nome + "\n" +
				"Potência Watts: " + potenciaWatts + "\n" + 
				"Horas por Dia: " + horasPorDia + "\n" +
				"Preço Kwh: R$ " + precoKwh + "\n" +
				"\nRelatório de Consumo:\n" +
				"Consumo Diário Wh: " + consumoDiarioWh() + "\n" + 
				"Consumo Mensal Wh: " + consumoMensalWh() + "\n" + 
				"Consumo Anual Wh: " + consumoAnualWh() + "\n" +  
				"Gasto Mensal: R$ " + gastoMensal(precoKwh) + "\n" 
				);
	}
	
	
	// Getters & Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (this.nome.isEmpty()) System.out.println("Nome Inválido");
		this.nome = nome;
	}

	public double getPotenciaWatts() {
		return potenciaWatts;
	}

	public void setPotenciaWatts(double potenciaWatts) {
		if (this.potenciaWatts < 0) System.out.println("Potência Inválida");
		this.potenciaWatts = potenciaWatts;
	}

	public double getHorasPorDia() {
		return horasPorDia;
	}

	public void setHorasPorDia(double horasPorDia) {
		if (this.horasPorDia > 24 || this.horasPorDia < 0) System.out.println("Hora Inválida");
		this.horasPorDia = horasPorDia;
	}
	
	
	
	
}

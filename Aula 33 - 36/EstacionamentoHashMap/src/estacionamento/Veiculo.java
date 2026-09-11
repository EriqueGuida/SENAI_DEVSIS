package estacionamento;

import java.time.LocalDate;

public class Veiculo {
	private String placa, modelo, proprietario;
	private int ano;

	// Constructor
	public Veiculo(String placa, String modelo, String proprietario, int ano) {
		this.placa = placa;
		this.modelo = modelo;
		this.proprietario = proprietario;
		this.ano = ano;
	}
	
	
	// Methods
	public void exibirDados() {
		System.out.printf("Veículo: %d | Modelo: %s |Placa: %s | Proprietário: %s", ano, modelo, placa, proprietario);
	}
	
	
	// Getters e Setters
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		if (placa.length() != 7)
			System.out.println("Placa Inválida");
		else
			this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		if (modelo.isEmpty())
			System.out.println("Modelo Inválido");
		else
			this.modelo = modelo;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		if (proprietario.isEmpty())
			System.out.println("Nome Inválido");
		else
			this.proprietario = proprietario;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		int anoAtual = LocalDate.now().getYear();
		
		if (ano < 1889 || ano > (anoAtual + 1))
			System.out.println("Ano Inválido");
		else
			this.ano = ano;
	}

}

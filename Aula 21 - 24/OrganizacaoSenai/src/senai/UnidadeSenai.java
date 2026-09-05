package senai;

import java.util.ArrayList;

public class UnidadeSenai {
	ArrayList<Departamento> departamentos;
	String nome;
	
	
	// Constructor
	public UnidadeSenai(String nome) {
		this.departamentos  = new ArrayList<>();;
		this.nome = nome;
	}
	
	
	// Methods
	public void addDepartamento(Departamento departamento) {
		departamentos.add(departamento);
	}
	
	public void getEstrutura() {
		System.out.println("SETOR: " + nome);
		
		for (Departamento d : departamentos) {
			d.getInfoSetor();
			d.getFuncionarios();
		}
	}

	
	// Getters N Setters 
	public ArrayList<Departamento> getDepartamentos() {
		return departamentos;
	}


	public void setDepartamentos(ArrayList<Departamento> departamentos) {
		this.departamentos = departamentos;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		if (this.nome.isEmpty()) System.out.println("Nome Inválido");
		this.nome = nome;
	}
	
	
	
}

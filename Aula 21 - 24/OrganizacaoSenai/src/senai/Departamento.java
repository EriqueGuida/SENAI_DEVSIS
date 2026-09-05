package senai;

import java.util.ArrayList;

public class Departamento {
	ArrayList<Funcionario> funcionarios;
	String telefone, nome;
	int codigo;
	
	
	// Constructor
	public Departamento(String nome, String telefone, int codigo) {
		this.funcionarios = new ArrayList<>();
		this.telefone = telefone;
		this.nome = nome;
		this.codigo = codigo;
	}
	
	
	// Methods
	public void addFuncionario(Funcionario funcionario) {
		funcionarios.add(funcionario);
	}
	
	public void getInfoSetor() {
		System.out.println(
				"\nDepartamento:\n" +
				"Nome: " + nome + "\n" +
				"Código: " + codigo + "\n" +
				"Telefone: " + telefone + "\n"
				);	
		}
	
	public void getFuncionarios() {
		for (Funcionario f : funcionarios) {
			System.out.println("");
			f.getInfoFuncionario();
		}
	}

	
	
	// Getters N Setters
	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		if (this.telefone.isEmpty()) System.out.println("Telefone Inválido");
		this.telefone = telefone;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		if (this.nome.isEmpty()) System.out.println("Nome Inválido");
		this.nome = nome;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		if (this.codigo < 0) System.out.println("Código Inválido");
		this.codigo = codigo;
	}


	public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	
}

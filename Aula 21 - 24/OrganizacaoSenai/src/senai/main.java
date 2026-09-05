package senai;

public class main {

	public static void main(String[] args) {
		
		UnidadeSenai unidade1 = new UnidadeSenai("Senai Valença");
				
		Departamento departamento1 = new Departamento("Tecnologia da Informação", "24999999999", 001);
		Departamento departamento2 = new Departamento("Administração", "24999999999", 002);
		
		Funcionario funcionario1 = new Funcionario("João", "Gerente", 5000, 001);
		Funcionario funcionario2 = new Funcionario("Carlos", "Estagiário", 1612, 002);
		Funcionario funcionario3 = new Funcionario("Pedro", "Gerente", 5000, 003);
		Funcionario funcionario4 = new Funcionario("Gabriel", "Estagiário", 1612, 004);
		
		unidade1.addDepartamento(departamento1);
		unidade1.addDepartamento(departamento2);
		
		departamento1.addFuncionario(funcionario1);
		departamento1.addFuncionario(funcionario2);
		departamento2.addFuncionario(funcionario3);
		departamento2.addFuncionario(funcionario4);
		
		unidade1.getEstrutura();
	}

}

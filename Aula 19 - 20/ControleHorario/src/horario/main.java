package horario;

public class main {

	public static void main(String[] args) {
		Horario horario1 = new Horario(20, 28, 36);
		horario1.exibir();
		
		Horario horario2 = new Horario();
		System.out.println(horario2.calcularSegundos());

		horario1.setHora(8);
		horario1.setMinuto(15);
		horario1.setSegundo(30);
		;
		horario1.exibir();
		System.out.println(horario1.calcularSegundos());

		Horario horario3 = new Horario(14, 20, 05);
		horario3.exibir();
		System.out.println(horario3.calcularSegundos());
	}

}

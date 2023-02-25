
public class TestaFuncionario {

	public static void main(String[] args) {

		Funcionario f1 = new Funcionario("Morgana Teles Barreto", 26, "morganateles@uniscar.com.br",
				"(11) 2734-4562", 1, 10919d);

		Funcionario f2 = new Funcionario("Rebecca Gouveia Santos", 40, "rebecagouveia@uniscar.com.br",
				"(11) 2998-5546", 3, 5553d);
		f1.visualizar();
		f2.visualizar();

		System.out.println();

		Gerente g1 = new Gerente("Bianca Demiquele", 29, "demiquele@uniscar.com.br",
				"(11) 2667-2998", 1, 15728d, 2);

		Gerente g2 = new Gerente("Renato Russo", 30, "renatorusso@uniscar.com.br",
				"(11) 2552-3269", 3, 5427d, 1);

		g1.visualizar();
		g2.visualizar();

		System.out.println();

		Vendedor v1 = new Vendedor("Vanessa Golçaves", 47, "vanessagoncalves@uniscar.com.br",
				"(11) 2122-3345", 3, 3740d, 73);

		Vendedor v2 = new Vendedor("Jeruza Franchesca", 27, "jeruzafranchesca@uniscar.com.br",
				"(11) 2827-3031", 3, 4210d, 102);

		v1.visualizar();
		v2.visualizar();

	}

}

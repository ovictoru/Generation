
public class TestaCliente {

	public static void main(String[] args) {

		Cliente c1 = new Cliente("Salete de Cassia", 49, "(11) 2563-0383", "saletedecassia@cardiosystem.com.br", 1);

		Cliente c2 = new Cliente("Erica Tescaro", 40, "(11) 2920-1292", "ericatescaro@adiretoria.com.br", 2);

		c1.visualizar();
		c2.visualizar();

	}

}


import java.util.ArrayList;

public class TestaCurso {

	public static void main(String[] args) {

		ArrayList<String> professores1 = new ArrayList<String>();
		professores1.add("Roberto Gomes");
		professores1.add("Marcia Marçal");
		Curso c1 = new Curso("Algoritmos e Lógica de Programação", 100, 3, professores1, 40);

		ArrayList<String> professores2 = new ArrayList<String>();
		professores2.add("Gabriel Farias");
		Curso c2 = new Curso("POO: Programação Orientada a Objetos", 80, 1, professores2, 28);

		c1.visualizar();
		c2.visualizar();
	}

}
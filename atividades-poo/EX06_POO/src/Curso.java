
import java.util.ArrayList;

public class Curso {
	private String titulo;
	private int duracao;
	private int periodo;
	
	private ArrayList<String> professores = new ArrayList<String>();
	private int qtdAlunos;

	public Curso(String titulo, int duracao, int periodo, ArrayList<String> professores, int qtdAlunos) {
		this.titulo = titulo;
		this.duracao = duracao;
		this.periodo = periodo;
		this.professores = professores;
		this.qtdAlunos = qtdAlunos;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	public ArrayList<String> getProfessores() {
		return professores;
	}

	public void setProfessores(ArrayList<String> professores) {
		this.professores.addAll(professores);
	}

	public int getQtdAlunos() {
		return qtdAlunos;
	}

	public void setQtdAlunos(int qtdAlunos) {
		this.qtdAlunos = qtdAlunos;
	}

	public void visualizar() {
		String periodo;
		switch (this.periodo) {
			case 1 -> periodo = "manhã";
			case 2 -> periodo = "tarde";
			case 3 -> periodo = "noite";
			case 4 -> periodo = "EAD";
			default -> periodo = "período não registrado";
		}

		System.out.println("\n********** Informações Gerais ***********");
		System.out.println("Titulo: " + this.titulo);
		System.out.println("Duração: " + this.duracao + "h");
		System.out.println("Quantidade de alunos: " + this.qtdAlunos);
		System.out.println("Período: " + periodo);
		System.out.print("Professor(a): ");
		
		if(this.professores.isEmpty() == false) {
			this.professores.sort(null);
			for (int indice = 0; indice < professores.size(); indice++) {
				if(indice == professores.size() - 1) {
					System.out.print(professores.get(indice));										
				} else {
					System.out.print(professores.get(indice) + ", ");					
				}
			}
		} else {
			System.out.println("nenhum professor atribuído");
		}
		System.out.println();
		
	}

}

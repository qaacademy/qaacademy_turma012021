package qaacademy_turma2;

import javax.swing.JOptionPane;

public class Exercicio03_easy_2 {

	public static void main(String[] args) {
		String nome, sobrenome, auxiliar;
		nome = "Flavio";
		sobrenome = "Dias";
		auxiliar = nome;
		nome = sobrenome;
		sobrenome = auxiliar;
		
		
		System.out.println("Nome: " + nome);
		System.out.println("Sobrenome: " + sobrenome);
	}

}

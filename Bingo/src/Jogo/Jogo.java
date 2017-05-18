package Jogo;

import bd.daos.*;

public class Jogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Usuarios livros = new Usuarios();
		
		try {
			System.out.println(livros.getLivros());
			System.out.println("Teste Commit");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

package Registro;

import java.util.Scanner;


public class Programa {
	
	/*
	 * VARIAVEIS GLOBAIS
	 * USUARIO REGISTRO E LOGIN
	 * SENHA REGISTRO E LO
	 */
	
	// VAR USER
	static String usuario;
	static String usuarioLogin;
	// VAR SENHA
	static long senha;
	static long senhaLogin;
	
	
	public static void main(String[] args) {
		
		// SCANNERS
		Scanner teclado = new Scanner(System.in);
		Scanner teclado2;
		
		
		
		System.out.println("------------");
		System.out.println("Ola Usuario!");
		System.out.println("------------");
		
		// REGISTRO
		
		System.out.println("");
		System.out.println("Registro");
		System.out.println("--------");
		
		System.out.print("Usuario: ");
		
		usuario = teclado.nextLine();
		
		do { 
			
			System.out.print("Senha: ");
			
			senha = teclado.nextLong();
			
			if (senha < 99999) {
			
				System.out.println("");
				System.out.println("A senha deve conter pelo menos 6 digitos.");
				System.out.println("");
				
			}
			
			if (senha == 123456 || senha == 1234567) {
				
				System.out.println("");
				System.out.println("Senha fraca.");
				System.out.println("");
				
			}
			
		} while(senha < 99999 || senha == 123456 || senha == 1234567);
		
		// LOGIN
		
		System.out.println("");
		System.out.println("Login");
		System.out.println("-----");
		
		do {
			
			teclado2 = new Scanner(System.in);
				
			System.out.print("Usuario: ");
			usuarioLogin = teclado2.nextLine();
				
			System.out.print("Senha: ");
			senhaLogin = teclado2.nextLong();
				
			if (!usuarioLogin.equals(usuario) || senhaLogin != senha) {
					
				System.out.println("");
				System.out.println("Usuario ou Senha incorretos.");
				System.out.println("");
					
			}  
			
		} while (!usuarioLogin.equals(usuario) || senhaLogin != senha);
			
		
			Programa entrada = new Programa();
			
			entrada.Personalizacao();
			
			teclado.close();
			teclado2.close();
			
	}
	
	
	public void Personalizacao() {
		
		// SCANNERS PERSONALIZAÇÃO
		
		Scanner perso = new Scanner(System.in);
		Scanner perso2 = new Scanner(System.in);
		Scanner perso3 = new Scanner(System.in);
		
		// VAR PERSONALIZAÇÃO DE PERFIL
		String nome;
		String nick;
		int idade;
		String comida;
		String jogo;
		String hobby;
		
		// CODIGO
		
		System.out.println("");
		System.out.println("Personalize seu perfil");
		System.out.println("----------------------");
		
		System.out.print("Nome: ");
		nome = perso.nextLine();
		
		System.out.print("Idade: ");
		idade = perso.nextInt();
		
		System.out.print("Nick: ");
		nick = perso2.nextLine();
		
		System.out.print("Jogo favorito: ");
		jogo = perso2.nextLine();
		
		System.out.print("Comida favorita: ");
		comida = perso3.nextLine();
		
		// MEMERS KKK
		
		System.out.print("Hobby: ");
		hobby = perso3.nextLine();
		
		if (hobby.equalsIgnoreCase("sentar")) {
			
			System.out.println("");
			System.out.println("Ta de parabéns.");
			System.out.println("");
			
		}
		
		// MENSAGENS
		
		System.out.println("");
		System.out.println("Perfil");
		System.out.println("------");
		System.out.println(nome + ", " + idade + " anos.");
		System.out.println("Jogo " + jogo + " (" + nick + " meu nick.).");
		System.out.println("Minha comida favorita eh " + comida + ".");
		System.out.println("Meu hobby eh " + hobby + ".");
		
		perso.close();
		perso2.close();
		perso3.close();
		
		Programa entrada = new Programa();
		
		entrada.Saida();
		
	}
	
	
	public void Saida() {
		
		
	}
	
}

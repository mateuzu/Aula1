package aula1;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {
		
		String nome;
		float distancia;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		nome = sc.next();
		System.out.print("Digite a distância: ");
		distancia = sc.nextFloat();
		
		System.out.println("\nParabéns " + nome + ", "
				+ "a sua distância percorrida foi de " + distancia + "km");
		
		sc.close();

	}

}

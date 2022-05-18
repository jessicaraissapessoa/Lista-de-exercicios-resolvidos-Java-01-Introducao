package listajava01;

import java.util.Scanner;

public class listajava01_01 {

	public static void main(String[] args) {

//Lista de Exercícios de Java 01 - Introdução / Básico
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: Jéssica Raissa Pessoa
		
Scanner teclado = new Scanner (System.in);
				
/* 01. Faça um algoritmo que receba dois números e ao final mostre a adição, subtração, multiplicação e divisão dos numeros lidos. */
		
	System.out.println("Informe o primeiro número: ");
	float n1 = teclado.nextFloat();
	System.out.println("Informe o segundo número: ");
	float n2 = teclado.nextFloat();
	
	float adicao = n1 + n2;
	float subtracao = n1 - n2;
	float multiplicacao = n1 * n2;
	float divisao = n1 / n2;
	
	System.out.println(n1 + " + " + n2 + " = " + adicao);
	System.out.println(n1 + " - " + n2 + " = " + subtracao);
	System.out.println(n1 + " * " + n2 + " = " + multiplicacao);
	System.out.println(n1 + " / " + n2 + " = " + divisao);
		
teclado.close();

	}

}

package listajava01;

import java.util.Scanner;

public class listajava01_03 {

	public static void main(String[] args) {

//Lista de Exercícios de Java 01 - Introdução / Básico
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: Jéssica Raissa Pessoa
		
Scanner teclado = new Scanner (System.in);
				
/* 03. Faça um programa que peça a temperatura em graus Celsius, transforme e mostre a temperatura em graus Fahrenheit. 
 * F = (C * 9/5) + 32 */
		
	System.out.println("Informe a temperatura em graus Celsius (ºC): ");
	float tc = teclado.nextFloat();
	
	float tf = (tc * 9/5f) + 32;
	
	System.out.println(tc + "ºC equivale a " + tf + "ºF.");

teclado.close();

	}

}

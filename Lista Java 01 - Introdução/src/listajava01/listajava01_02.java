package listajava01;

import java.util.Scanner;

public class listajava01_02 {

	public static void main(String[] args) {

//Lista de Exercícios de Java 01 - Introdução / Básico
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: Jéssica Raissa Pessoa
		
Scanner teclado = new Scanner (System.in);
				
/* 02. Faça um programa que peça a temperatura em graus Fahrenheit, transforme e mostre em graus Celsius.
 * C = (F - 32) * 5/9  */
		
	System.out.println("Informe a temperatura em graus Farenheit (ºF): ");
	float tf = teclado.nextFloat();
	
	float tc = ( tf - 32f ) * 5/9f ;
	
	System.out.println(tf + "ºF equivale a " + tc + "ºC.");

teclado.close();

	}

}

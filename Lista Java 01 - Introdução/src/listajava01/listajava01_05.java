package listajava01;

import java.util.Scanner;
import java.text.DecimalFormat;

public class listajava01_05 {

	public static void main(String[] args) {

//Lista de Exercícios de Java 01 - Introdução / Básico
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: Jéssica Raissa Pessoa
		
Scanner teclado = new Scanner (System.in);
				
/* 05. A padaria da FPB vende certa quantidade de pães franceses e certa quantidade de broas a cada dia.
 * Cada pãozinho custa R$0.12 e cada broa custa R$1.50.
 * Ao final do dia, o dono quer saber o quanto arrecadou com as vendas de pães e broas.
 * Ele deve, também, guardar 10% do que arrecadou na poupança.
 * Desenvolva um programa para informar ao dono o valor arrecadado e o valor a ser depositado na poupança. */
	
	DecimalFormat reais = new DecimalFormat ("R$ ##0.00");
	
	System.out.println("Quantos pãezinhos foram vendidos hoje?");
	int qtddpaes = teclado.nextInt();
	
	System.out.println("Quantas broas foram vendidas hoje?");
	int qtddbroas = teclado.nextInt();
	
	double valorpaes = qtddpaes * 0.12;
	double valorbroas = qtddbroas * 1.50;
	
	double arrecadado = valorpaes + valorbroas;
	
	double poupanca = arrecadado * 0.1;
	
	System.out.println("O valor total arrecadado hoje foi: " + reais.format(arrecadado));
	System.out.println("O valor a ser depositado na poupança hoje é: " + reais.format(poupanca));

teclado.close();

	}

}

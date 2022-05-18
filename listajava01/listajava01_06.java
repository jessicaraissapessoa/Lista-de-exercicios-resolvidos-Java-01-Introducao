package listajava01;

import java.util.Scanner;
import java.text.DecimalFormat;

public class listajava01_06 {

	public static void main(String[] args) {

//Lista de Exercícios de Java 01 - Introdução / Básico
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: Jéssica Raissa Pessoa
		
Scanner teclado = new Scanner (System.in);
				
/* 06. Três amigos (João, Carlos e Paulo), decidiram rachar igualmente uma conta de um bar.
 * Faça um programa para ler o valor total da conta e imprimir quanto cada um deve pagar.
 * João e Carlos não devem pagar os centavos.
 * Ex: Valor da conta R$9,70; João e Carlos pagam R$3,00, cada; Paulo paga R$3,70.
 * Utilizar a classe a seguir:
 * DecimalFormat df = new DecimalFormat("##0.00");
 * df.format();*/
	
	DecimalFormat reais = new DecimalFormat ("R$ ##0.00");
	
	System.out.println("Qual o valor total da conta?");
	double conta = teclado.nextDouble();
	
	
	//forma 1:
	
	double divisao = conta / 3;
	
	double joao = (int) divisao;
	double carlos = joao;
	double paulo = conta - (joao + carlos);
	
	System.out.println("O valor total da conta é: " + reais.format(conta));
	System.out.println("João deverá pagar: " + reais.format(joao));
	System.out.println("Carlos deverá pagar: " + reais.format(carlos));
	System.out.println("Paulo deverá pagar: " + reais.format(paulo));
	
	
	//forma 2:
	
	int intconta = (int) conta;
	int intterco = intconta / 3;
	double comcentavos = conta - (2 * intterco);
	
	System.out.println("O valor total da conta é: " + reais.format(conta));
	System.out.println("João deverá pagar: " + reais.format(intterco));
	System.out.println("Carlos deverá pagar: " + reais.format(intterco));
	System.out.println("Paulo deverá pagar: " + reais.format(comcentavos));
	
teclado.close();

	}

}

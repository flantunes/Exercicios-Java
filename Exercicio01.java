package br.com.exercicios;

import java.util.Scanner;

public class Exercicio01 {


	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
	   int num, maiorNum = 0;
	   int cont;
	   
	   for(cont = 1; cont <=3; cont++) {
	   System.out.println("Escreva um numero:  ");
	   num = ler.nextInt();
			   
	   if(num > maiorNum) {
		   maiorNum = num;
	   
	   }
       
	}
       System.out.println("O maior numero digitado é: " + maiorNum);
          
}
}
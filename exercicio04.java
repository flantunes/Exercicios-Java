package br.com.exercicios;

import java.util.*;

public class exercicio04 {
	
public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int num, resposta;
        
        System.out.println("Digite um n�mero: ");
        num = entrada.nextInt();
        resposta = num % 2;
        
        if(resposta == 0) {
            System.out.println("Seu n�mero � par:"); 
            System.out.println(Math.sqrt(num));
        }
        else {
            System.out.println("Seu n�mero � �mpar: ");
            System.out.println(Math.pow(num, 2));
        }
        

    }

}


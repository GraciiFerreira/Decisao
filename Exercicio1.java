package EstDecisao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero, maiorNum=0, igual=0;
		
		for(int x=1; x<=3; x++) {
			System.out.println("Digite o " +x+ "° numero:");
			numero = leia.nextInt();
			
			if (numero > maiorNum) {
				maiorNum = numero;
				
			}
			
			else { 
				
				if (numero == igual) {
					igual++;
					
					
				}
							
			}			
			
		}
			if (igual==0) {
				
				System.out.println("Não há um numero maior!.");
		

			}else {
		
				System.out.println("O maior numero é: " + maiorNum);
		}
	}	
}

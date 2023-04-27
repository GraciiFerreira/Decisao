package EstDecisao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
	
		int idade;
		
		System.out.println("Digite a idade: ");
		idade = leia.nextInt();
		
							
			if (idade <= 14 && idade >= 10) {
				System.out.println("Esta pessoa se encontra na categoria infantil.");
			}
			
			else if (idade <= 17 && idade >= 15) {
				System.out.println("Esta pessoa se encontra na categoria juvenil.");
			}
			
			else if (idade <= 25 && idade >= 18) {
				System.out.println("Esta pessoa se encontra na categoria adulto.");
			}
			
			else {
				System.out.println("Esta pessoa não se encontra em nenhuma categoria.");
			}
	}

}

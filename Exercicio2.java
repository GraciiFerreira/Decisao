package EstDecisao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int num1=0,num2=0, num3=0, um, dois, tres;
		
		System.out.println("Digite o 1º número: ");
		um = leia.nextInt();
			
		System.out.println("Digite o 2º número: ");
		dois = leia.nextInt();	
		
		System.out.println("Digite o 3º número: ");
		tres = leia.nextInt();
		
		num1 = um;
	
		if(dois <num1) {
			num1=dois;			
		}
		
		if(tres<num1) {
			num1=tres;
		}
		
		num3 = um;
		
		if (dois>num3) {
			num3=dois;
		}
		
		if(tres > num3) {
			num3=tres;
		}
		
		 
		num2 =(um + dois + tres) - num1 - num3;
		
		if (um == dois) {
			if (dois == tres) {
			System.out.println("Os número informados são iguais.");
			}
		}else {
			System.out.println("A ordem crescente dos números informados é a seguinte: " + um + ", " + dois + " e " + tres);
		}
	}

}

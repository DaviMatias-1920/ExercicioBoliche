package pacoteBoliche;

import java.util.Scanner;

public class ExercicioBoliche {
	public static void main (String[] args) {
		int arremesso1 = 0;
		int arremesso2 = 0;
		int pontuacaoTotalArremesso1 = 0;
		int pontuacaoTotalArremesso2 = 0;
		int pontuacaoStrike = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o nome do competidor: ");
		String nome = entrada.nextLine();
		System.out.println(nome);
		
		for (int i = 1; i <= 10; i++){
			System.out.println("Rodada" +i);
			Scanner entrada1 = new Scanner(System.in);
			System.out.println("Quantos pinos o participante derrubou no primeiro arremesso?: ");
			arremesso1 = entrada1.nextInt();
			
			if (arremesso1 == 10) {
				System.out.println("Strike!");
				pontuacaoStrike += arremesso1;
			}
			else {
				Scanner entrada2 = new Scanner (System.in);
				System.out.println("Quantos pinos o participante derrubou no segundo arremesso?: ");
				arremesso2 = entrada2.nextInt();
				
				int pinosRestantes = arremesso2 + arremesso1;
				//*Caso o numero de pinos restantes seja zero, sera um spare//
				int totalPinos = 10 - pinosRestantes;
				
				if (totalPinos == 0 ) {
					System.out.println("Spare!");
				}
			}
			pontuacaoTotalArremesso1 += arremesso1;
			pontuacaoTotalArremesso2 += arremesso2;
		}
		int pontuacaoTotalPartida = 0;
		pontuacaoTotalPartida = pontuacaoTotalArremesso1 + pontuacaoTotalArremesso2;
		if (pontuacaoStrike == 100) {
			System.out.println("Sua pontuação total foi: "+ (pontuacaoStrike * 3));
		}
		else {
			System.out.println("Sua pontuação total foi: "+ pontuacaoTotalPartida);
		}
	}
}

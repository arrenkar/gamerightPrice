package GameRightPrice;

import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		
		Random r = new Random();
		int essai = 0;
		int justprix = r.nextInt(200);
		int prix = 0;
		
		while(justprix != prix) {
			
			System.out.println("Entrez un numéro entre 0 et 200");
			Scanner scan = new Scanner(System.in);
			
			
			if(justprix > prix) {
				System.out.println("C'est plus !");
			}else {
				System.out.println("C'est moins !");
			}
			
			prix = scan.nextInt();
			essai ++;
		}

		System.out.println("Bravo ! Le juste prix est : " + justprix);
		System.out.println("En " + essai + " essai ");
	}

}

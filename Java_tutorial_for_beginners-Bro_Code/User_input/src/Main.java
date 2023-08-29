
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//vytvorenie skeneru
		Scanner nazov_skener = new Scanner(System.in);
		
		//zistenie mena
		System.out.print("Ako sa volas?");
		System.out.print("\nNapis meno: ");
		String meno = nazov_skener.next();	
		//zistenie veku		
		
		System.out.print("\nKolko mas rokov?");
		System.out.print("\nTvoj vek: ");
		int vek = nazov_skener.nextInt();
		
		//vypisanie na obrazovku
		System.out.println("\nVitaj " +meno+ ",");
		System.out.println("Tvoj vek je " +vek+ " rokov!");
		
	}

}

package Ivan;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String meno = JOptionPane.showInputDialog("Ako sa voláš?");
		JOptionPane.showMessageDialog(null, "Ahoj " +meno);
		
		int vek = Integer.parseInt(JOptionPane.showInputDialog("Koľko máš rokov?"));
		JOptionPane.showMessageDialog(null, "Tvoj vek je " +vek+ " rokov");
		
		double vyska = Double.parseDouble(JOptionPane.showInputDialog("Aka je tvoja vyska?"));
		JOptionPane.showMessageDialog(null, "Tvoja vyska je " +vyska+ " cm");
		
	}

}

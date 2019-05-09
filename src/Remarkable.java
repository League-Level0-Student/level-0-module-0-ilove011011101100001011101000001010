import javax.swing.JOptionPane;

public class Remarkable {
	public static void main(String[] args) {
		// carlosJesus,Melanie,Ayden,Jacob,Luis,Johnpaul,daniel,Hieu,diego
		String ayden = "is bad at fn and bad at apeg";
		String jacob = "is good at fn and good at apeg";
		String luis = "is the beast at apeg and ok at fn";
		String hieu = "idk i berlly evne KnOW THAtkid";
		String name = JOptionPane.showInputDialog(null, "what is your name");
		if (name.equals("luis")) {
			JOptionPane.showMessageDialog(null, "luis is a beast at apeg");
		}
		if (name.equals("ayden")) {
			JOptionPane.showMessageDialog(null, " ayden is bad at fn and bad at apeg");
		}
		if (name.equals("jacob"))
			JOptionPane.showMessageDialog(null, "is good at fn and good at apeg");
		{

		}

		if (name.equals("hieu"))
			JOptionPane.showMessageDialog(null, "idk i berlly evne KnOW THAtkid");

		{

		}
	}
}
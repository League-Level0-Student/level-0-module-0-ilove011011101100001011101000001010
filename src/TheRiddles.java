import javax.swing.JOptionPane;

public class TheRiddles {
	public static void main(String[] args) {
		int score = 0;
		String anser = JOptionPane.showInputDialog(null, "Who makes it, has no need of it.\n"
				+ "Who buys it, has no use for it.\n" + "Who uses it can neither see nor feel it." + "What is it?");
		if (anser.equals("coffin")) {
			JOptionPane.showMessageDialog(null, "you got it right");
			score++;

		} else {
			JOptionPane.showMessageDialog(null, "you're not right");

		}
		String riddles = JOptionPane.showInputDialog(null,
				"I'm tall when I'm young and I'm short when I'm old." + " What am I? ");
		if (riddles.equals("candle")) {
			JOptionPane.showMessageDialog(null, "you got it right");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "you're not right");
		}
		System.out.println(score);

	}
}

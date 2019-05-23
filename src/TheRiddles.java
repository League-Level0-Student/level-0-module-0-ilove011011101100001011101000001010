import javax.swing.JOptionPane;

public class TheRiddles {
	public static void main(String[] args) {
		int score = 0;
		String anser = JOptionPane.showInputDialog(null,"Who makes it, has no need of it.\n"+
				"Who buys it, has no use for it.\n"+
				"Who uses it can neither see nor feel it."+
				"What is it?" );
		if( "coffin".equals(anser ) ) {
		JOptionPane.showMessageDialog(null, "you got it right" );
		
	}

}
}

import javax.swing.JOptionPane;

public class MessageBox {
       public static void main(String[] args) {
		//password is 01101100 01110101 01101001 01110011 00100000
    	String password = "01101100 01110101 01101001 01110011 00100000";
   String message =  JOptionPane.showInputDialog(null,"give me a message");
   String guess = JOptionPane.showInputDialog(null,"guess the password");
    	
    	if (password.equals(guess)) {
			JOptionPane.showMessageDialog(null,message);
			
    	}
    	else {
			JOptionPane.showMessageDialog(null,"go awy ");
    	}
	}
}

package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {
	
String code = JOptionPane.showInputDialog("So, do you know how to write code?");
	
	if(code.equals("yes")){
		JOptionPane.showMessageDialog(null, "Good. You can help me take over Medici. And the world, maybe. But Medici is better, in my opinion.");
	} else {
		JOptionPane.showMessageDialog(null, "Welp! have fun with washing my dishes.");
	}
		
	

	}
}


package day3;

import javax.swing.JOptionPane;

public class dialogueUsingStrings {
public static void main(String[] args) {
	
	String name;
	String age;
	String lives;
	
	name = JOptionPane.showInputDialog("can i know name pls");
	age = JOptionPane.showInputDialog("thanks, now what is your age, i need to know this for reasons");
	lives = JOptionPane.showInputDialog("one last thing: where do you live?");
			
	JOptionPane.showMessageDialog(null, "I now know that you are "+age+", your name is "+name+", and you live at/in "+lives+". You really shouldn't be giving stuff away so carelessly like that.");
	
}
	
}

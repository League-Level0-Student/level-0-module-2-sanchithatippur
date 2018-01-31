package extra;

import javax.swing.JOptionPane;

public class Roller_Coaster9 {
public static void main(String[] args) {
 String input=JOptionPane.showInputDialog("What is your height?");
 int height = Integer.parseInt(input);
 if (height<48) {
System.out.println("Ummmmm you don't belong on this ride so....get outta here");
 }
 else { 
System.out.println("Ummmm I guess to would be ok to ride...but beware");	 
 }
}
 
}


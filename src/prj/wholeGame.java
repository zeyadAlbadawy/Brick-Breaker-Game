package prj;

import javax.swing.JFrame;

public class wholeGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frm = new JFrame();
		playGame playG = new playGame();
		frm.setBounds(10, 10, 700, 600);
		frm.setTitle("Brick Breaker Game");
		frm.setResizable(false);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// add the playGame class to the object from Jframe.
		frm.add(playG);
		
	}
}

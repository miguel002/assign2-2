package assignment1;

import javax.swing.*;
/*Ram*/

public class MVC {
/**
 * CS 4743 Assignment 1 by <Luis Cortes, Ram Patel: Assign2>
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InventoryModel model = new InventoryModel();
		InventoryView view = new InventoryView();
		InventoryController controller = new InventoryController(view, model);
		view.registerListeners(controller);
		view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		view.setSize(700, 500);
		view.setVisible(true);
	}
	
}

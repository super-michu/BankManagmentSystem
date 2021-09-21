package com.company;
import javax.swing.*;
public class Main {

    public static void main(String[] args) {
	// Action to run an application, model MVC
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                GUI gui = new GUI();
                AppController app = new AppController(gui);
                gui.setController(app);
                gui.setVisible(true);
            }
        });
    }
}

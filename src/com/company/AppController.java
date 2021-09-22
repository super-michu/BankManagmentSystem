package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// Class to handle the gui
public class AppController extends BankCustomer implements ActionListener {
    private final GUI app;
    //Constructor for AppController
    public AppController(GUI gui){
        this.app = gui;
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals("Create Account")){
            this.app.setDialog();
        }
        else if(e.getActionCommand().equals("Deposit")){
            this.app.infoLabel.setText("Deposit: " + deposit + "$");
        }
        else if(e.getActionCommand().equals("Withdraw")){
            this.app.infoLabel.setText("Withdraw: " + withdraw + "$");
        }
        else if(e.getActionCommand().equals("Check Balance")){
            this.app.infoLabel.setText("Your balance: " + balance + "$");
        }
        else if(e.getActionCommand().equals("Info")){
            this.app.infoLabel.setText("| RULES | IN OUR BANK EACH 5TH WITHDRAW COSTS 5$");
        }
        else if(e.getActionCommand().equals("Exit")){
            if (JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        }
    }
}

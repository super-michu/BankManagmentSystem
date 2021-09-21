package com.company;
import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {
    //Interface to use Bank Managment System with menu
    private JButton createAcc, withdraw, deposit, checkBalance, exit, info;
    //Constructor of GUI
    public GUI(){
        setMainPanel();
    }
    // Making a main panel
    private void setMainPanel(){
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(new Color(200, 195, 195));
        mainPanel.setPreferredSize(new Dimension(700,300));
        mainPanel.setMinimumSize(new Dimension(200,200));
        mainPanel.add(setSelectPanel(),BorderLayout.WEST);
        mainPanel.add(setLabelPanel(),BorderLayout.CENTER);
        this.getContentPane().add(mainPanel);
        setFrame();
    }
    // Making a select panel with action buttons
    private JPanel setSelectPanel(){
        JPanel selectPanel = new JPanel ();
        selectPanel.setLayout(new GridLayout(6,1));
        selectPanel.setBorder(BorderFactory.createTitledBorder("Select Panel"));
        createAcc = new JButton("Create Account");
        selectPanel.add(createAcc);
        deposit = new JButton("Deposit");
        selectPanel.add(deposit);
        withdraw = new JButton("Withdraw");
        selectPanel.add(withdraw);
        checkBalance = new JButton("Check Balance");
        selectPanel.add(checkBalance);
        info = new JButton("Info");
        selectPanel.add(info);
        exit = new JButton("Exit");
        selectPanel.add(exit);
        return selectPanel;
    }
    // Making a panel to show informations
    private JPanel setLabelPanel(){
        JPanel labelPanel = new JPanel();
        return  labelPanel;
    }
    // Making a frame for Bank System
    private void setFrame(){
        setTitle("Welcome in the Bank Managment Sys.");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        pack();
    }
}

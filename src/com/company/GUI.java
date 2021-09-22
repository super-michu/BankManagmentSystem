package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {
    //Interface to use Bank Managment System with menu
    private JButton createAcc, withdraw, deposit, checkBalance, exit, info;
    public JLabel infoLabel;
    //Constructor of GUI
    public GUI(){
        this.getContentPane().add(setMainPanel());
        setFrame();
        setLocationRelativeTo(null);
    }
    // Making a main panel
    private JPanel setMainPanel(){
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(new Color(200, 195, 195));
        mainPanel.setPreferredSize(new Dimension(700,300));
        mainPanel.setMinimumSize(new Dimension(200,200));
        mainPanel.add(setSelectPanel(),BorderLayout.WEST);
        mainPanel.add(setinfoPanel(),BorderLayout.CENTER);
        return mainPanel;
    }
    // Making a select panel with action buttons
    private JPanel setSelectPanel(){
        JPanel selectPanel = new JPanel (new GridLayout(6,1));
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
    // Making a panel for showing some informations
    private JPanel setinfoPanel(){
        JPanel infoPanel = new JPanel();
        infoPanel.setLayout(new GridBagLayout());
        infoLabel = new JLabel("BANK NAME");
        infoPanel.add(infoLabel);
        infoPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        return infoPanel;
    }
    public JDialog setDialog(){
        JDialog dialog = new JDialog(this,"ACCOUNT CREATOR");
        dialog.setSize(500,200);
        dialog.setVisible(true);
        //User
        JLabel userLabel = new JLabel("User Name :");
        JTextField userText = new JTextField();
        // Password
        JLabel passwordLabel = new JLabel("Password :");
        JPasswordField passwordTest = new JPasswordField();
        //Button
        JLabel emptyLabel = new JLabel("");
        JButton submit = new JButton("SUBMIT");
        //Dialog panel
        JPanel panel = new JPanel(new GridLayout(3,2));
        panel.add(userLabel);
        panel.add(userText);
        panel.add(passwordLabel);
        panel.add(passwordTest);
        panel.add(emptyLabel);
        panel.add(submit);
        submit.addActionListener(e -> {});
        dialog.add(panel);
        dialog.setLocationRelativeTo(null);
        return dialog;

    }
    // Making a frame for Bank System
    public void setFrame(){
        setTitle("Welcome in the Bank Managment Sys.");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
    }
    // Add actionlistener's to buttons
    public void setController(ActionListener c){
        this.createAcc.addActionListener(c);
        this.deposit.addActionListener(c);
        this.withdraw.addActionListener(c);
        this.checkBalance.addActionListener(c);
        this.info.addActionListener(c);
        this.exit.addActionListener(c);
    }
}

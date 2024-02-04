/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Admin
 */
//there are two ways to create a JFrame . 
// 1. association - creating the object of Frame class
// 2. inheritance - extending Frame class
// in my project i use association to create a JFrame .
//main class
public class Menu {

    //jcomponent classes jbutton,jlabel
    JButton midBTN, finalBTN, finalGradeBTN, exitBTN;
    JLabel label, label2;

    //parameterized constructor menu
    //cannot be abstract,static or final
    Menu() {
        //Graphical user interface
        //container jframe
        JFrame frame = new JFrame("GUI GRADING SYSTEM");

        //container jpanel
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints cons = new GridBagConstraints();

        cons.weightx = 1;
        cons.weighty = .25;
        cons.insets = new Insets(5, 0, 5, 0);
        cons.gridwidth = GridBagConstraints.REMAINDER;
        cons.fill = GridBagConstraints.BOTH;

        label = new JLabel("GRADING SYSTEM");
        label.setFont(new Font("Verdana", Font.BOLD, 42));
        label.setForeground(Color.red);
        label.setHorizontalAlignment(JLabel.CENTER);
        panel.add(label, cons);

        midBTN = new JButton("MIDTERM");
        midBTN.setFont(new Font("Verdana", Font.BOLD, 20));
        midBTN.setForeground(Color.DARK_GRAY);
        midBTN.setBackground(Color.black);
        midBTN.addActionListener((ActionEvent e) -> {
            if (e.getSource() == midBTN) {
                Midterm midterm = new Midterm();
                frame.dispose();
            }
        });
        panel.add(midBTN, cons);

        finalBTN = new JButton("FINAL");
        finalBTN.setForeground(Color.DARK_GRAY);
        finalBTN.setBackground(Color.black);
        finalBTN.setFont(new Font("Verdana", Font.BOLD, 20));
        finalBTN.addActionListener((ActionEvent e) -> {
            if (e.getSource() == finalBTN) {
                Final Final = new Final();
                frame.dispose();
            }
        });
        panel.add(finalBTN, cons);

        finalGradeBTN = new JButton("FINAL GRADE");
        finalGradeBTN.setForeground(Color.DARK_GRAY);
        finalGradeBTN.setBackground(Color.black);
        finalGradeBTN.setFont(new Font("Verdana", Font.BOLD, 20));
        finalGradeBTN.addActionListener((ActionEvent e) -> {
            if (e.getSource() == finalGradeBTN) {
                finalGrade fingrade = new finalGrade();
                frame.dispose();
            }
        });
        panel.add(finalGradeBTN, cons);

        exitBTN = new JButton("EXIT");
        exitBTN.setForeground(Color.red);
        exitBTN.setBackground(Color.black);
        exitBTN.setFont(new Font("Verdana", Font.BOLD, 20));
        exitBTN.addActionListener((ActionEvent e) -> {
            if (e.getSource() == exitBTN) {
                System.exit(0);
                //frame.dispose();
            }
        });
        panel.add(exitBTN, cons);

        frame.add(panel);
        frame.pack();
        frame.setSize(500, 700);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Admin\\Downloads\\Sharingan_Triple.png");
        frame.setIconImage(icon);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
        }
        new Menu();
    }
}

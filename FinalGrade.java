/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */
//there are two ways to create a JFrame . 
// 1. association - creating the object of Frame class
// 2. inheritance - extending Frame class
// in my project i use association to create a JFrame .
class finalGrade {

    public static double midframe = 0;
    public static double finframe = 0;

    
    double average = (getMidframe() + getFinframe()) / 2;

   
    String rating;

    JFrame frame = new JFrame("FINAL GRADE");

    //constructor jlabel,jtextfield,jbutton
    JLabel fmidj, fing, finr, adjr;
    JTextField fmidjTF, fingTF, finrTF;
    JButton exitBTN;

    finalGrade() {

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints cons = new GridBagConstraints();

        cons.weightx = .25;
        cons.weighty = .25;
        cons.insets = new Insets(5, 5, 5, 5);
        cons.gridwidth = GridBagConstraints.REMAINDER;
        cons.fill = GridBagConstraints.CENTER;

        //constructor JLabel
        JLabel label = new JLabel("FINAL GRADE");
        label.setForeground(Color.red);
        label.setFont(new Font("Verdana", Font.BOLD, 50));
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.TOP);
        panel.add(label, cons);

        fmidj = new JLabel("FINAL MIDTERM GRADE:");
        fmidj.setFont(new Font("Verdana", Font.BOLD, 25));
        panel.add(fmidj);
        
        fmidjTF = new JTextField(15);
        fmidjTF.setText(Double.toString(getMidframe()));

        fmidjTF.setPreferredSize(new Dimension(25, 50));
        fmidjTF.setHorizontalAlignment(JLabel.CENTER);
        fmidjTF.setEditable(false);
        panel.add(fmidjTF, cons);

        fing = new JLabel("FINAL GRADE:");
        fing.setFont(new Font("Verdana", Font.BOLD, 25));
        panel.add(fing);
        
        fingTF = new JTextField(15);
        fingTF.setPreferredSize(new Dimension(25, 50));
        fingTF.setHorizontalAlignment(JLabel.CENTER);
        fingTF.setEditable(false);
        fingTF.setText(Double.toString(getFinframe()));
        panel.add(fingTF, cons);

        finr = new JLabel("FINAL RATING:");
        finr.setForeground(Color.blue);
        finr.setFont(new Font("Verdana", Font.BOLD, 25));
        panel.add(finr);
        
        finrTF = new JTextField(15);
        finrTF.setPreferredSize(new Dimension(25, 50));
        finrTF.setHorizontalAlignment(JLabel.CENTER);
        finrTF.setEditable(false);
        finrTF.setText(Double.toString(getAverage()));
        panel.add(finrTF, cons);

        adjr = new JLabel("ADJECTIVAL RATING:");
        adjr.setForeground(Color.blue);
        adjr.setFont(new Font("Verdana", Font.BOLD, 25));
        panel.add(adjr);

        JTextField adjrTF = new JTextField(15);
        adjrTF.setPreferredSize(new Dimension(25, 50));
        adjrTF.setHorizontalAlignment(JLabel.CENTER);
        adjrTF.setEditable(false);

        if (average >= 101 || average <= -10) {
            rating = "Invalid";
            //adjrTF.setText("Invalid !");
        } else if (average >= 98 && average <= 100) {
            rating = "E";
            //adjrTF.setText("E");
        } else if (average >= 95 && average < 98) {
            rating = "O";
            //adjrTF.setText("O");
        } else if (average >= 90 && average < 95) {
            rating = "V";
            //adjrTF.setText("V");
        } else if (average >= 86 && average < 90) {
            rating = "G";
            //adjrTF.setText("G");
        } else if (average >= 80 && average < 86) {
            rating = "S";
            //adjrTF.setText("S");
        } else if (average >= 75 && average < 80) {
            rating = "P";
            //adjrTF.setText("P");
        } else if (average <= 75) {
            rating = "F";
            //adjrTF.setText("F");
        }

        adjrTF.setText(getRating());
        panel.add(adjrTF, cons);

        exitBTN = new JButton("Exit ");
        exitBTN.setFont(new Font("Verdana", Font.BOLD, 30));
        exitBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == exitBTN) {
                    Menu menu = new Menu();
                    frame.dispose();
                }
            }
        });
        panel.add(exitBTN, cons);

        frame.add(panel);
        frame.setSize(500, 700);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.pack();
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Admin\\Downloads\\Sharingan_Triple.png");
        frame.setIconImage(icon);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void setRating(String rating) {
        this.rating = rating;
    }
    public String getRating() {
        return rating;
    }
    public static double getFinframe() {
        return finframe;
    }

    public static void setFinframe(double finframe) {
        finalGrade.finframe = finframe;
    }
     public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public static double getMidframe() {
        return midframe;
    }

    public static void setMidframe(double midframe) {
        finalGrade.midframe = midframe;
    }  
}

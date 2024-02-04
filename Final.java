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
import javax.swing.JOptionPane;
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
public class Final {

    JFrame frame = new JFrame("FINAL");

    JLabel quiz1, quiz2, quiz3, finproj, finex;
    JLabel fq, fp, fe, fj;
    JTextField quiz1TF, quiz2TF, quiz3TF, finprojTF, finexTF;
    JTextField fqTF, fpTF, feTF, fjTF;
    JButton exitBTN, resetBTN, totalBTN;

    Final() {

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints cons = new GridBagConstraints();

        cons.weightx = .25;
        cons.weighty = .25;
        cons.insets = new Insets(5, 5, 5, 5);
        cons.gridwidth = GridBagConstraints.REMAINDER;
        cons.fill = GridBagConstraints.CENTER;

        JLabel label = new JLabel("FINAL");
        label.setForeground(Color.red);
        label.setFont(new Font("Verdana", Font.BOLD, 50));
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.TOP);
        panel.add(label, cons);

        quiz1 = new JLabel("Quiz 1:");
        quiz1.setFont(new Font("Verdana", Font.BOLD, 15));
        panel.add(quiz1);
        quiz1TF = new JTextField(25);
        quiz1TF.setPreferredSize(new Dimension(25, 40));
        quiz1TF.setHorizontalAlignment(JLabel.CENTER);       
        panel.add(quiz1TF, cons);
        
         quiz2= new JLabel("Quiz 1:");
        quiz2.setFont(new Font("Verdana", Font.BOLD, 15));
        panel.add(quiz2);
        quiz2TF = new JTextField(25);
        quiz2TF.setPreferredSize(new Dimension(25, 40));
        quiz2TF.setHorizontalAlignment(JLabel.CENTER);       
        panel.add(quiz2TF, cons);


        quiz3 = new JLabel("Quiz 3:");
        quiz3.setFont(new Font("Verdana", Font.BOLD, 15));
        panel.add(quiz3);
        quiz3TF = new JTextField(25);
        quiz3TF.setPreferredSize(new Dimension(25, 40));
        quiz3TF.setHorizontalAlignment(JLabel.CENTER);
        panel.add(quiz3TF, cons);

        finproj = new JLabel("Final Project:");
        finproj.setFont(new Font("Verdana", Font.BOLD, 15));
        panel.add(finproj);
        finprojTF = new JTextField(25);
        finprojTF.setPreferredSize(new Dimension(25, 40));
        finprojTF.setHorizontalAlignment(JLabel.CENTER);
        panel.add(finprojTF, cons);

        finex = new JLabel("Final Exam:");
        finex.setFont(new Font("Verdana", Font.BOLD, 15));
        panel.add(finex);
        finexTF = new JTextField(25);
        finexTF.setPreferredSize(new Dimension(25, 40));
        finexTF.setHorizontalAlignment(JLabel.CENTER);
        panel.add(finexTF, cons);

        fq = new JLabel("Total Final Quizes:");
        fq.setForeground(Color.blue);
        fq.setFont(new Font("Verdana", Font.BOLD, 15));
        panel.add(fq);
        fqTF = new JTextField(25);
        fqTF.setPreferredSize(new Dimension(25, 40));
        fqTF.setHorizontalAlignment(JLabel.CENTER);
        fqTF.setEditable(false);
        panel.add(fqTF, cons);

        fp = new JLabel("Total of Final Project x20%:");
        fp.setForeground(Color.blue);
        fp.setFont(new Font("Verdana", Font.BOLD, 15));
        panel.add(fp);
        fpTF = new JTextField(25);
        fpTF.setPreferredSize(new Dimension(25, 40));
        fpTF.setHorizontalAlignment(JLabel.CENTER);
        fpTF.setEditable(false);
        panel.add(fpTF, cons);

        fe = new JLabel("Total of Final Exam x40%:");
        fe.setForeground(Color.blue);
        fe.setFont(new Font("Verdana", Font.BOLD, 15));
        panel.add(fe);
        feTF = new JTextField(25);
        feTF.setPreferredSize(new Dimension(25, 40));
        feTF.setHorizontalAlignment(JLabel.CENTER);
        feTF.setEditable(false);
        panel.add(feTF, cons);

        fj = new JLabel("Final Grade:");
        fj.setForeground(Color.BLUE);
        fj.setFont(new Font("Verdana", Font.BOLD, 20));
        panel.add(fj);
        fjTF = new JTextField(25);
        fjTF.setPreferredSize(new Dimension(25, 40));
        fjTF.setHorizontalAlignment(JLabel.CENTER);
        fjTF.setEditable(false);
        panel.add(fjTF, cons);

        totalBTN = new JButton("Compute");
        totalBTN.setFont(new Font("Verdana", Font.BOLD, 25));
        
        totalBTN.addActionListener(new ActionListener() {
            private double quiz1;
            private double quiz2;
            private double quiz3;
            private double final_proj;
            private double final_exam;
            private double final_quiz;
            private double allproject;
            private double allfinalExam;
            private double allfinalTots = 0;
            private double allquiz1;

            @Override
            public void actionPerformed(ActionEvent e) {

                if (quiz1TF.getText().isEmpty() && quiz2TF.getText().isEmpty() && quiz3TF.getText().isEmpty() && finprojTF.getText().isEmpty() && finexTF.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(panel, "TextBox empty", "Error", JOptionPane.ERROR_MESSAGE);
                } else if ((quiz1TF.getText().isEmpty() || quiz2TF.getText().isEmpty() || quiz3TF.getText().isEmpty() || finprojTF.getText().isEmpty() || finexTF.getText().isEmpty())) {
                    JOptionPane.showMessageDialog(panel, "There are empty textbox ", "Warning", JOptionPane.WARNING_MESSAGE);
                } else {
                    getfinalTots();
                    JOptionPane.showMessageDialog(panel, "Final completed");
                }
            }

            public void setquiz1(double quiz1) {
                this.quiz1 = quiz1;
            }

            public double getquiz1() {
                return quiz1;
            }

            public void setquiz2(double quiz2) {
                this.quiz2 = quiz2;
            }

            public double getquiz2() {
                return quiz2;
            }

            public void setquiz3(double quiz3) {
                this.quiz3 = quiz3;
            }

            public double getquiz3() {
                return quiz3;
            }

            public void setfinproject(double final_proj) {
                this.final_proj = final_proj;
            }

            public double getfinproject() {
                return final_proj;
            }

            public void setfinalexam(double final_exam) {
                this.final_exam = final_exam;
            }

            public double getfinalexam() {
                return final_exam;
            }

            public void setquiztotal(double allquiz1, double allquiz) {
                this.final_quiz = allquiz1;
            }

            public double getquiztotal() {
                return final_quiz;
            }

            public void setfinprojtotal(double project) {
                this.allproject = project;
            }

            public double getfinprojtotal() {
                allproject = final_proj * 0.2;
                return allproject;
            }

            public void setfinalExamTots(double finalExam_tots) {
                this.allfinalExam = finalExam_tots;
            }

            public double getfinalExamTots() {
                return allfinalExam;
            }

            public void setfinalTots(double finaltots) {
                this.allfinalTots = finaltots;
            }

            public double getfinalTots() {

                quiz1 = Double.parseDouble(quiz1TF.getText());
                quiz2 = Double.parseDouble(quiz2TF.getText());
                quiz3 = Double.parseDouble(quiz3TF.getText());
                final_proj = Double.parseDouble(finprojTF.getText());
                final_exam = Double.parseDouble(finexTF.getText());

                final_quiz = (quiz1 + quiz2 + quiz3) / 3;

                allquiz1 = final_quiz * 0.4;
                allproject = final_proj * 0.2;
                allfinalExam = final_exam * 0.4;

                allfinalTots = allquiz1 + allproject + allfinalExam;
                finalGrade.finframe = allfinalTots;

                fqTF.setText(String.valueOf(allquiz1));
                fpTF.setText(String.valueOf(allproject));
                feTF.setText(String.valueOf(allfinalExam));
                fjTF.setText(Double.toString(allfinalTots));

                return allfinalTots;
            }
        });
        panel.add(totalBTN);

        resetBTN = new JButton("Reset");
        resetBTN.setFont(new Font("Verdana", Font.BOLD, 25));
        resetBTN.addActionListener((ActionEvent e) -> {
            if (e.getSource() == resetBTN) {
                quiz1TF.setText("");
                quiz2TF.setText("");
                quiz3TF.setText("");
                finprojTF.setText("");
                finexTF.setText("");
                fqTF.setText("");
                fpTF.setText("");
                feTF.setText("");
                fjTF.setText("");
            }
        });
        panel.add(resetBTN);

        exitBTN = new JButton("Exit ");
        exitBTN.setFont(new Font("Verdana", Font.BOLD, 25));
        exitBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == exitBTN) {
                    Menu menu = new Menu();
                    frame.dispose();
                }
            }
        });
        panel.add(exitBTN);

        frame.add(panel);
        frame.setSize(500, 700);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.pack();
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Admin\\Downloads\\Sharingan_Triple.png");
        frame.setIconImage(icon);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

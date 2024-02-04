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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Admin
 */
public class Midterm {

    JFrame frame = new JFrame("MIDTERM");

    JLabel quiz1, quiz2, quiz3, midproj, midex;
    JLabel mq, mp, me, mj;
    JLabel label1;
    JTextField quiz1TF, quiz2TF, quiz3TF, midprojTF, midexTF;
    JTextField mqTF, mpTF, meTF, mjTF;
    JButton exitBTN, resetBTN, totalBTN;

    Midterm() {

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints cons = new GridBagConstraints();

        cons.weightx = .25;
        cons.weighty = .25;
        cons.insets = new Insets(5, 5, 5, 5);
        cons.gridwidth = GridBagConstraints.REMAINDER;
        cons.fill = GridBagConstraints.CENTER;

        JLabel label = new JLabel("MIDTERM");
        label.setForeground(Color.red);
        label.setFont(new Font("Verdana", Font.BOLD, 50));
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.TOP);
        panel.add(label, cons);

        quiz1 = new JLabel("Quiz 1:");
        quiz1.setFont(new Font("Verdana", Font.BOLD, 15));
        panel.add(quiz1);
        quiz1TF = new JTextField(25);
        //quiz1TF = new JFormattedTextField(formatter);       
        quiz1TF.setColumns(25);
        quiz1TF.setPreferredSize(new Dimension(25, 40));
        quiz1TF.setHorizontalAlignment(JLabel.CENTER);
        panel.add(quiz1TF, cons);

        quiz2 = new JLabel("Quiz 2:");
        quiz2.setFont(new Font("Verdana", Font.BOLD, 15));
        panel.add(quiz2);
        quiz2TF = new JTextField(25);
        //quiz2TF = new JFormattedTextField(formatter);
        quiz2TF.setColumns(25);
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

        midproj = new JLabel("Midterm Project:");
        midproj.setFont(new Font("Verdana", Font.BOLD, 15));
        panel.add(midproj);
        midprojTF = new JTextField(25);
        midprojTF.setPreferredSize(new Dimension(25, 40));
        midprojTF.setHorizontalAlignment(JLabel.CENTER);
        panel.add(midprojTF, cons);

        midex = new JLabel("Midterm Exam:");
        midex.setFont(new Font("Verdana", Font.BOLD, 15));
        panel.add(midex);
        midexTF = new JTextField(25);
        midexTF.setPreferredSize(new Dimension(25, 40));
        midexTF.setHorizontalAlignment(JLabel.CENTER);
        panel.add(midexTF, cons);

        mq = new JLabel("Total Midterm Quizes:");
        mq.setForeground(Color.blue);
        mq.setFont(new Font("Verdana", Font.BOLD, 15));
        panel.add(mq);
        mqTF = new JTextField(25);
        mqTF.setPreferredSize(new Dimension(25, 40));
        mqTF.setHorizontalAlignment(JLabel.CENTER);
        mqTF.setEditable(false);
        panel.add(mqTF, cons);

        mp = new JLabel("Total of Midterm Project x20%:");
        mp.setForeground(Color.blue);
        mp.setFont(new Font("Verdana", Font.BOLD, 15));
        panel.add(mp);
        mpTF = new JTextField(25);
        mpTF.setPreferredSize(new Dimension(25, 40));
        mpTF.setHorizontalAlignment(JLabel.CENTER);
        mpTF.setEditable(false);
        panel.add(mpTF, cons);

        me = new JLabel("Total of Midterm Exam x40%:");
        me.setForeground(Color.blue);
        me.setFont(new Font("Verdana", Font.BOLD, 15));
        panel.add(me);
        meTF = new JTextField(25);
        meTF.setPreferredSize(new Dimension(25, 40));
        meTF.setHorizontalAlignment(JLabel.CENTER);
        meTF.setEditable(false);
        panel.add(meTF, cons);

        mj = new JLabel("Midterm Grade:");
        mj.setForeground(Color.BLUE);
        mj.setFont(new Font("Verdana", Font.BOLD, 20));
        panel.add(mj);
        mjTF = new JTextField(25);
        mjTF.setPreferredSize(new Dimension(25, 40));
        mjTF.setHorizontalAlignment(JLabel.CENTER);
        mjTF.setEditable(false);
        panel.add(mjTF, cons);

        totalBTN = new JButton("Compute");
        totalBTN.setFont(new Font("Verdana", Font.BOLD, 25));

        totalBTN.addActionListener(new ActionListener() {
            private double quiz1;
            private double quiz2;
            private double quiz3;
            private double midproj;
            private double midex;
            private double allmidquiz;
            private double allproject;
            private double allmidExam;
            private double allmidTots = 0;
            private double allquiz1;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (quiz1TF.getText().isEmpty() && quiz2TF.getText().isEmpty()
                        && quiz3TF.getText().isEmpty() && midprojTF.getText().isEmpty()
                        && midexTF.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(panel, "TextBox empty", "Error", JOptionPane.ERROR_MESSAGE);
                } else if ((quiz1TF.getText().isEmpty() || quiz2TF.getText().isEmpty()
                        || quiz3TF.getText().isEmpty() || midprojTF.getText().isEmpty()
                        || midexTF.getText().isEmpty())) {
                    JOptionPane.showMessageDialog(panel, "There are empty textbox ", "Warning", JOptionPane.WARNING_MESSAGE);
                } else {
                    getmidtermTots();
                    JOptionPane.showMessageDialog(panel, "Midterm completed");
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

            public void setmidproject(double mproj) {
                this.midproj = mproj;
            }

            public double getmidproject() {
                return midproj;
            }

            public void setmidtermexam(double midexam) {
                this.midex = midexam;
            }

            public double getmidtermexam() {
                return midex;
            }

            public void setquiztotal(double allquiz1, double allquiz) {
                this.allmidquiz = allquiz1;
            }

            public double getquiztotal() {
                return allmidquiz;
            }

            public void setmidprojtotal(double project) {
                this.allproject = project;
            }

            public double getmidprojtotal() {
                allproject = midproj * 0.2;
                return allproject;
            }

            public void setmidtermExamTots(double midextots) {
                this.allmidExam = midextots;
            }

            public double getmidtermExamTots() {
                return allmidExam;
            }

            public void setmidtermTots(double midtermtots) {
                this.allmidTots = midtermtots;
            }

            public double getmidtermTots() {

                quiz1 = Double.parseDouble(quiz1TF.getText());
                quiz2 = Double.parseDouble(quiz2TF.getText());
                quiz3 = Double.parseDouble(quiz3TF.getText());
                midproj = Double.parseDouble(midprojTF.getText());
                midex = Double.parseDouble(midexTF.getText());

                allmidquiz = (quiz1 + quiz2 + quiz3) / 3;
                allquiz1 = allmidquiz * 0.4;
                allproject = midproj * 0.2;
                allmidExam = midex * 0.4;

                allmidTots = allquiz1 + allproject + allmidExam;
                finalGrade.midframe = allmidTots;

                mqTF.setText(String.valueOf(allquiz1));
                mpTF.setText(String.valueOf(allproject));
                meTF.setText(String.valueOf(allmidExam));
                mjTF.setText(Double.toString(allmidTots));

                return allmidTots;
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
                midprojTF.setText("");
                midexTF.setText("");
                mqTF.setText("");
                mpTF.setText("");
                meTF.setText("");
                mjTF.setText("");
            }
        });
        panel.add(resetBTN);

        exitBTN = new JButton("Exit ");
        exitBTN.setFont(new Font("Verdana", Font.BOLD, 25));
        exitBTN.addActionListener((var e) -> {
            if (e.getSource() == exitBTN) {
                Menu menu = new Menu();
                frame.dispose();
            }
        });
        panel.add(exitBTN);

        frame.add(panel);
        frame.setSize(500, 700);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.pack();
        frame.setLocationRelativeTo(null);
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Admin\\Downloads\\Sharingan_Triple.png");
        frame.setIconImage(icon);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

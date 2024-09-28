package bmiApp;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.*;
class View extends JFrame implements ActionListener{

    JLabel lHeight, lWeight, lBMI;
    JTextField tHeight, tWeight;
    JButton bCalc, bUsage;

    public View(){
        setTitle("Body Mass Index Calculator");
        setSize(340,250);
        setLayout(new GridLayout(4, 2));

        lHeight = new JLabel("Enter Height (in meters)");
        add(lHeight);
        tHeight = new JTextField();
        add(tHeight);
        lWeight = new JLabel("Enter Weight (in kilograms)");
        add(lWeight);
        tWeight = new JTextField();
        add(tWeight);

        bCalc = new JButton("Calculate BMI");
        add(bCalc);
        bCalc.addActionListener(this);
        lBMI = new JLabel("BMI is ...");
        add(lBMI);
        bUsage = new JButton("Instructions");
        bUsage.addActionListener(this);
        add(bUsage);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource() == bUsage) {
        JOptionPane.showMessageDialog(rootPane, "Do not use this if you are minor or pregnant");
       }
    }
}
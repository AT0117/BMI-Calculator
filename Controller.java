package bmiApp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Controller{
    Model model;
    View view;

    public Controller(Model m, View v){
        model = m;
        view = v;
    }

    public void setInfo(){
        view.bCalc.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e){
                    model.setUserHeight(Float.parseFloat(view.tHeight.getText()));
                    model.setUserWeight(Float.parseFloat(view.tWeight.getText()));
                    model.setBMI(model.getUserHeight(), model.getUserWeight());
                    view.lBMI.setText(String.valueOf(model.getBMI()));
                }
            }
        );
    }

}
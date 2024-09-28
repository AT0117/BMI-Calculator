package bmiApp;
class BMICalculator{
    public static void main(String[] args) {
       Model model = new Model(0, 0, 0);
       View view = new View();
       Controller controller = new Controller(model, view);
       controller.setInfo();
    }
}
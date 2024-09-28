package bmiApp;
class Model{
    float height, weight, bmi;

    public Model(float height, float weight, float bmi){
        this.bmi = bmi;
        this.height = height;
        this.weight = weight;
    }
    public float getUserHeight(){
        return height;
    }
    public void setUserHeight(float height){
        this.height = height;
    }

    public float getUserWeight(){
        return weight;
    }
    public void setUserWeight(float weight){
        this.weight = weight;
    }
   
    public float getBMI(){
        return bmi;
    }
    public void setBMI(float height, float weight){
        this.height = height;
        this.weight = weight;
        bmi = weight / (height * height);
    }

}
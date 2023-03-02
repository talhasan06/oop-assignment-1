package Ques3;

public class Homemade extends Food{
    double protien;
    public Homemade(double calories,double fat,double carb,double protien){
        super(calories,fat,carb);
        this.protien=protien;
    }
    void Homemadereview(){
        System.out.println("Inside review method of Homemade class");
    }
    void Description(){
        System.out.println("Inside homemade class");
    }
}

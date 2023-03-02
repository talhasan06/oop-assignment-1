package Ques3;

public class FastFood extends Food{
    String type,flavour;
    public FastFood(double calories,double fat,double carb,String type,String flavour){
        super(calories,fat,carb);
        this.type=type;
        this.flavour=flavour;
    }
    public void Fastfoodreview(){
        System.out.println("Inside the review method of Fastfood class");
    }

}

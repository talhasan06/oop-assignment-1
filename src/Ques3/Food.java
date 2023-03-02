package Ques3;

public class Food {
    double calories,fat,carb;
    public Food(double calories,double fat,double carb){
        this.calories=calories;
        this.fat=fat;
        this.carb=carb;
    }
    Food(){

    }
    void Description(){
        System.out.println("Inside food class");
    }

}

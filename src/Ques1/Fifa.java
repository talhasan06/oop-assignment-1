package Ques1;

public class Fifa {
    int noOfGoals;
    String venue;
    public Fifa(){
        System.out.println("Who will be the winner?");
    }
    public Fifa(int noOfGoals,String venue){
        this.noOfGoals=noOfGoals;
        this.venue=venue;
    }
    public String toString(){
        return (noOfGoals+" "+venue);
    }

}

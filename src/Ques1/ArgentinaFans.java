package Ques1;

public class ArgentinaFans extends Fifa{
    private int havingWorldCups=0;
    public void setHavingWorldCups(int havingWorldCups){
        this.havingWorldCups+=havingWorldCups;
    }
    public int getHavingWorldCups(){
        return havingWorldCups;
    }
    public ArgentinaFans(int noOfGoals,String venue,int havingWorldCups){
        this.noOfGoals=noOfGoals;
        this.venue=venue;
        this.havingWorldCups=havingWorldCups;
    }
    public String toString(){
        return (noOfGoals+" "+venue+" "+havingWorldCups);
    }
    public void incrementWorldCups()
    {
        setHavingWorldCups(1);
    }
}

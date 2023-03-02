package Ques1;

public class Mid {
    public static void main(String[] args) {
        ArgentinaFans agr=new ArgentinaFans(10,"Qatar",2);
        BrazilFans bra=new BrazilFans(7,"Qatar",5);
        if(agr.noOfGoals>bra.noOfGoals){
            agr.incrementWorldCups();
            System.out.println("Argentina will win");
        }else{
            bra.incrementWorldCups();
            System.out.println("Brazil will win");
        }
    }
}
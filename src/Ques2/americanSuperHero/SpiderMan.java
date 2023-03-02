package Ques2.americanSuperHero;

public class SpiderMan {
    String movieName;
    String directedBy;
    public SpiderMan(String movieName,String directedBy){
        this.movieName=movieName;
        this.directedBy=directedBy;
    }
    public void show(){
        System.out.println(movieName+" "+directedBy);
    }
}

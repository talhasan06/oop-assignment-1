package Ques6;

public class Test {
    public static void main(String[] args) {
        Person p=new Person();
        p.id=1;
        p.name="Steven";
//        System.out.println(p.id);
//        System.out.println(p.name);
        double height=p.getHeight();
        double weight=p.getWeight();
        double bmi=weight/(height*height);

        Person[]arr=new Person[3];
    }
}

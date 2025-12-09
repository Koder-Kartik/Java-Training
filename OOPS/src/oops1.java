import java .util.*;

class demo{
    int age;
    String name;
    public void get_info(){
        System.out.println("The name of the student is "+this.name);
        System.out.println("The age of the student is "+this.age);

    }
}

public class oops1 {

    static void main(String[] args) {
        demo s1 = new demo();
        s1.name="XYZ";
        s1.age=34;
        s1.get_info();
        demo s2=new demo();
        s2.name="ABC";
        s2.age=24;
        s2.get_info();
    }
}

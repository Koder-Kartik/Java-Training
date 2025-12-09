import java.util.*;
class parts{
    String name;
    int year;
    String colour;
    public void dis(){
        System.out.print("nam="+this.name+"\n");
        System.out.print("manufactuuring year="+this.year+"\n");
        System.out.print("colour="+this.colour);
    }
}

public class oops2 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in) ;

        parts s1=new parts();
        System.out.print("enter name"+"\n");
        s1.name=sc.nextLine();
        System.out.print("enter colour"+"\n");
        s1.colour=sc.nextLine();
        System.out.print("enter manufacture year"+"\n");
        s1.year=sc.nextInt();

        System.out.print("car info"+"\n");
        s1.dis();
    }}
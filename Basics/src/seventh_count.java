import java.util.*;
public class seventh_count {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int a = sc.nextInt();
        int count = 0;
        int temp =a;

        while(temp>0)
        {
            temp = temp/10;
            count++;
        }

        System.out.println("The number of digits are "+count );


    }
}

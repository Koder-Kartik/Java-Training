import java.util.*;
public class fifth_leap_year
{
    static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year");
        int y =sc.nextInt();
        if (y % 400 == 0)
        {
            System.out.println("Leap Year");
        }
        else if (y % 100 == 0)
        {
            System.out.println("Not Leap Year");
        }
        else if (y % 4 == 0)
        {
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not Leap Year");
        }


    }
}

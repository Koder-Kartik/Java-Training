import java.util.*;
public class eighth_sumofdigits
{
    static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int a = sc.nextInt();
        int sum = 0;
        int temp =a;
        int b;

        while(temp>0)
        {
            b = temp%10;
            sum += b;

            temp = temp/10;
        }

        System.out.println("The number of digits are "+sum );
    }
}

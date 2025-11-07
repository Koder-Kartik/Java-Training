import java.util.*;
public class ninth_arraysum
{
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr= {3,4,5,6,7};


            int sum = 0;
            for(int i = 0; i < arr.length; i++){
                sum = sum + arr[i];
            }
            System.out.println("Sum = " + sum);



    }
}

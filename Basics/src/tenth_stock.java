import java.util.*;
public class tenth_stock
{
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr= {12,5,7,14,95,12,98,1};


        int max=arr[0];
        int min=Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++) {
            int p = arr[i];


            if (p < min)
                min = p;
            if (max<arr[i]-min) {
                    max = arr[i]-min;
                }

        }

        System.out.println("Profit = " + max);



    }
}

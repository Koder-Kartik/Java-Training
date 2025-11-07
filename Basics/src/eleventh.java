import java.util.Scanner;

public class eleventh {

    static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int [] arr= {3,0,1,0,4,0,2};
            int sum=0;


            for(int i = 0; i < arr.length-1; i++) {

                int left = arr[i];
                for(int j = 0; j< i; j++) {
                    if (left < arr[j])
                        left = arr[j];
                }
                int right = arr[i+1];
                for(int j = i; j< arr.length; j++) {
                    if (right < arr[j])
                        right = arr[j];
                }

                if(left<right)
                    sum+=left-arr[i];
                else {
                    sum += right - arr[i];
                }
            }
        System.out.println("Sum = " +sum);
    }

}

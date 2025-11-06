import java.util.Scanner;

public class sixth_LCM {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();


        int lcm = (a > b) ? a : b;

        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                System.out.println("LCM is: " + lcm);
                break;
            }
            lcm++;
        }

    }
}

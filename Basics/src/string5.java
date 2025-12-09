import java.util.*;
public class string5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String temp = sc.next();

        for (int i = 0; i < temp.length() - 1; i++) {
            System.out.println(temp.charAt(i) + "" + temp.charAt(i + 1));
        }

    }
}

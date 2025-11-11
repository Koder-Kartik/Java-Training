import java.util.*;
public class twelfth {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String line = sc.nextLine();
        String[] y = line.split(" ");
        int x = y.length;
        if(y[0].equals("java") && y[x-1].equals("language") )
        {
            System.out.print("Yes");
        }
        else {
            System.out.println("No");
        }



    }
}

import java.util.*;
public class Panagram {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");

        String s = sc.nextLine();
        int [] arr=new int[26];

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // convert uppercase to lowercase
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }

            // process only lowercase letters
            if (ch >= 'a' && ch <= 'z') {
                arr[ch - 'a'] += 1;
            }
        }



        for(int i : arr){
            if(i==0){
                System.out.println("Not panagram");
                break;
            }
            System.out.println("Panagram");
            break;
        }




    }

}

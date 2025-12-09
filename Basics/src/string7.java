import java.util.*;
public class string7 {
    static void main(String[] args) {

        Map<String,Integer> mp = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");

        String s = sc.nextLine();
        int [] arr=new int[26];


        String[] words =s.split("\\s+");




        for(String w : words){
            if(freq.get(w)==1){
                System.out.println("First unique word: "+w);
                return ;
            }
        }
        System.out.println("No unique word found");
    }
}

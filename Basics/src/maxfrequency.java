import java.util.*;
public class maxfrequency {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = {1, 2, 3, 4, 5, 1, 2, 6, 7, 7, 7,};
        HashMap<Integer, Integer> np = new HashMap<>();
        for (int i : a)
            np.put(i, np.getOrDefault(i, 0) + 1);
        for (int key : np.keySet())
            System.out.println(key + "---> " + np.get(key));

        int n,m=0,j=0;
        for (int key : np.keySet()) {
            n = np.get(key);
            if (n > m) {
                m = n;
                j = key;

            }
        }
        System.out.println("the max time is "+m+"the value is"+j+" ");

        System.out.println(m);
        System.out.println(j);
    }
}
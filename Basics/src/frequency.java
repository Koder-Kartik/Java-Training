import java.util.*;
public class frequency {
    static void main(String[] args) {

        int [] arr={1,2,3,4,5,6,7,8,98,6,4,32,4,5,7,8,764,35,64,2,45,7,0,42,12,34,4,56,6,};
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i :arr){
            mp.put(i,mp.getOrDefault(i,0)+1);

        }
        for(int key: mp.keySet()){
            System.out.println(key+" --> "+mp.get(key));
        }
    }
}

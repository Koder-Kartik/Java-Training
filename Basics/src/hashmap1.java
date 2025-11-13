import java.util.HashMap;

public class hashmap1 {
    static void main(String[] args) {
        HashMap<Integer,String> student=new HashMap<>();
        student.put(5,"Kartik");
        student.put(10,"Aditya");
        student.put(49,"Chashni");

        System.out.println(student.get(5));
        System.out.println(student.getOrDefault(15,"not present"));
        student.remove(12);
        System.out.println(student.keySet());
        System.out.println(student.values());
        int [] arr={1,2,3,4};
        for(int key : student.keySet()){
            System.out.println("key is "+key+" val is "+student.get(key));
        }






    }
}



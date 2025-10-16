package interveiwprep;

import java.util.HashMap;
import java.util.Map;

public class MapEx {
    public static void main(String[] args) {
        HashMap<Integer, Integer> data = new HashMap<>();
        data.put(101, 85);
        data.put(102, 75);
        data.put(103, 65);
        data.put(104, 89);
        data.put(105, 95);

//        System.out.println(data);
        for (Map.Entry<Integer, Integer> entry: data.entrySet()){
            System.out.println("rollNumber:"+entry.getKey()+" Marks:"+entry.getValue());
        }
    }
}

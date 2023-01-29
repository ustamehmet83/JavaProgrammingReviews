package week21_28_01_2023.map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Test2 {

    // her the Male spartans
    public static void main(String[] args) {

        List<Map<String,Object>>result=new ArrayList<>();

        for (Map<String, Object> spartan : Spartans.getSpartans()) {
            if (spartan.get("gender").toString().equalsIgnoreCase("Male")) {
                result.add(spartan);
            }
        }
        System.out.println(result);
        System.out.println(result.size());

    }
}

import java.util.HashMap;

public class Intro {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 10);
        hm.put("US", 10);
        hm.put("Pak", 10);
        hm.put("China", 10);

        System.out.println(hm);

        hm.put("UK", 30);
        hm.put("US", 300);

        System.out.println(hm.get("US"));
        System.out.println(hm.get("paris"));

        System.out.println(hm.containsKey("paris"));
        System.out.println(hm.containsKey("US"));

        for(String key:hm.keySet()){
            Integer val=hm.get(key);
            System.out.println(key+" "+val);
        }

    }
}

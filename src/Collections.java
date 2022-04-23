import java.util.*;

public class Collections {

    public static void main(String[] args) {
        List<String>  list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        System.out.println(list.get(1));
        System.out.println(list.size());

        for (String elm : list){
            System.out.println(elm);
        }

        Set<String> setDemon = new HashSet<>();
        setDemon.add("Hello");
        setDemon.add("world");
        System.out.println("Elements in set: " + setDemon);

        Iterator value = setDemon.iterator();
        while (value.hasNext()){
            System.out.println(value.next());
        }

        Map<String,String> map = new HashMap<>();
        map.put("naam","Antonio");
        map.put("Achternaam","Seraus");
        map.put("Adres","Kikkenstein 2824");
        map.put("Plaats","Amsterdam");

        System.out.println(map.get("naam"));

        for (Map.Entry<String, String> elem : map.entrySet()){
            System.out.print(elem.getKey() + ":");
            System.out.println(elem.getValue());
        }

    }
}


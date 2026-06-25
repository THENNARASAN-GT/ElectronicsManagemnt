import java.util.HashMap;
import java.util.Map;
class HashMapEx{
    public static void main(String[] ar){
        HashMap<String,Integer> Electronics=new HashMap<>();
        // Adding key and values
        Electronics.put("Washing Machine",1);
        Electronics.put("Air Cooler",2);
        Electronics.put("Fridge",3);
        Electronics.put("Fan",4);
        Electronics.put("Air Cooler",5);
        // Get the key
        //System.out.println(Electronics.get("Air Cooler"));
        // Update the key and value
        Electronics.put("LED",3);
        if(Electronics.containsKey("Air Cooler")){
            System.out.println("Air Cooler is Available");
        }
        Electronics.remove("Fan");
        for(Map.Entry<String,Integer>entry:Electronics.entrySet()){
            System.out.println("Electronics:"+entry.getKey()+" Stock:"+entry.getValue());

        }

System.out.println(Electronics);

    }

}
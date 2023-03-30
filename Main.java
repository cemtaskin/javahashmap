import java.security.DrbgParameters.Capability;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,String> capitalCities = new HashMap<String,String>(); 
        capitalCities.put("Turkey", "Ankara");
        capitalCities.put("Englang", "London");
        capitalCities.put("Bulgaria", "Sofia");
        capitalCities.put("Greece", "Athens");

        for (String capitalCity : capitalCities.values()) {
            System.out.println(capitalCity);   
        }


        for (String key : capitalCities.keySet()) {
            System.out.println(key);   
        }
        
        
    }    
}

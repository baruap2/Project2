package datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UseHashMap {
    public static void main(String[] args) {
        Map<String, String> personalInfo = new HashMap<>();
        personalInfo.put("first name:", "john");
        personalInfo.put("last name:", "doe");
        personalInfo.put("cellphone:", "23423534");
        personalInfo.put("email address:", "johndoe@gmail.com");



        System.out.println(personalInfo.get("cellphone" ));
        for(Map.Entry entry: personalInfo.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        List<String> citiesOfUSA = new ArrayList<>();
        citiesOfUSA.add("NYC");
        citiesOfUSA.add("LA");
        citiesOfUSA.add("Miami");
        List<String> citiesOfCANADA = new ArrayList<>();
        citiesOfCANADA.add("Toronto");
        citiesOfCANADA.add("Montreal");
        citiesOfCANADA.add("Ottawa");
        List<String> citiesOfENGLAND = new ArrayList<>();
        citiesOfENGLAND.add("london");
        citiesOfENGLAND.add("manchester");
        citiesOfCANADA.add("leeds");

        Map<String, List<String>> map = new HashMap<>();
        map.put("USA", citiesOfUSA);
        map.put("CANADA", citiesOfCANADA);
        map.put("England", citiesOfENGLAND);

        System.out.println(map.get("USA"));
        for (Map.Entry entry: map.entrySet()){
           System.out.println(entry.getKey()+" "+entry.getValue());

        }

    }
}

package test;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String ,String> languages = new HashMap<>();
        if(languages.containsKey("Java")){
            System.out.println("Java already exists");
        }
        else{
            languages.put("Java","a compiled high level language,object-oriented,platform independent language");
            System.out.println("Java added successfully");
        }
//        languages.put("Java","a compiled high level language,object-oriented,platform independent language");
        languages.put("Python","an interpreted ,object-oriented,hight-level porgramming language with dynamic semantics");
        languages.put("Algol","an algorithmic language");
        System.out.println(languages.put("BASIC","Beginners All Purpose Symbolic Instruction Code"));
        System.out.println(languages.put("Lisp","Therein lies madness"));

        //System.out.println(languages.get("Java"));
       // System.out.println(languages.put("Java","this course is about Java"));
        //System.out.println(languages.get("Java"));

        if(languages.containsKey("Java")){
            System.out.println("Java is already in the map");
        }
        else{
            languages.put("Java","this course is about Java");
        }
        System.out.println("===================================");


        languages.remove("Lisp");
        if(languages.remove("Algo","a family of algorithmic languages")){
            System.out.println("Algo removed");
        }
        else{
            System.out.println("Algo not removed");
        }

        for(String key : languages.keySet()){
            System.out.println(key + " : " + languages.get(key));
        }
    }

}

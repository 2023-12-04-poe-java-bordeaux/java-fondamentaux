package journee3_13_decembre_2023.cours;

import java.util.ArrayList;

public class Point1TableauxDynamiques {
    public static void main(String[] args) {
        String[] fruits=new String[5];
        ArrayList<String> fruits2=new ArrayList<>();

        System.out.println("Tableau 1 : "+fruits.length);
        System.out.println("Tableau 2 : "+fruits2.size());

        fruits2.add("Oranges");
        fruits2.add("Pommes");

        System.out.println("Tableau 2 : "+fruits2.size());
        System.out.println(fruits2);

    }
}

package journee4_14_decembre_2023.cours;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleStream {
    public static void main(String[] args) {
        // Version 1
        List<Integer> nombres= Arrays.asList(2,3,4,5,6,7,8);

        List<Integer> nombresAuCarre=new ArrayList<>();

        for(int nombre:nombres){
            nombresAuCarre.add(nombre*nombre);
        }

        System.out.println(nombres);
        System.out.println(nombresAuCarre);

        // Version 2
        List<Integer> nombres2= Arrays.asList(2,3,4,5,6,7,8);
        List<Integer> nombres2AuCarre=nombres2
                .stream()
                .map(nombre->nombre*nombre)
                .collect(Collectors.toList());

        System.out.println(nombres2);
        System.out.println(nombres2AuCarre);

        // filter => {5,6,7,8}
        // map => 25, 36, 49, 64
        //  forEach...
        nombres2.stream().filter(nombre->nombre>4).map(nombre->nombre*nombre).forEach(nombre-> System.out.println(nombre));
    }
}

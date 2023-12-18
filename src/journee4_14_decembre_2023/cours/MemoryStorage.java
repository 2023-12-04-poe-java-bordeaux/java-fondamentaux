package journee4_14_decembre_2023.cours;

import java.util.Scanner;

public class MemoryStorage {
    public static void main(String[] args) {
//        int[] a={1,2,3,4,5};
//        int[] b=a;
//        int[] c={1,2,3,4,5};

//        System.out.println(Arrays.toString(a));
//        System.out.println(Arrays.toString(b));

//        a[0]=45; //{45,2,3,4,5};
//        b[4]=99; //{1,2,3,4,99};
//
//        System.out.println(Arrays.toString(a));
//        System.out.println(Arrays.toString(b));

//        if(a==b){
//            System.out.println("a et b ont la même adresse");
//        }else{
//            System.out.println("a et b n'ont pas la même adresse");
//        }
//
//
//        if(a==c){
//            System.out.println("a et c ont la même adresse");
//        }else{
//            System.out.println("a et c n'ont pas la même adresse");
//        }

        Scanner scanner=new Scanner(System.in);
        String name="chris";
        String name2="chris";

        String name3=scanner.next();
//        name3=name2.intern();

        if(name==name2){
            System.out.println("name et name2 pointent vers la même adresse");
        }else{
            System.out.println("name et name2 ne pointent pas vers la même adresse");
        }

        if(name==name3){
            System.out.println("name et name3 pointent vers la même adresse");
        }else{
            System.out.println("name et name3 ne pointent pas vers la même adresse");
        }


        if(name.equals(name2)){
            System.out.println("name et name2 ont la même valeur");
        }else{
            System.out.println("name et name2 n'ont pas la même valeur");
        }

        if(name.equals(name3)){
            System.out.println("name et name3 pointent vers la même adresse");
        }else{
            System.out.println("name et name3 ne pointent pas vers la même adresse");
        }
        scanner.close();
    }
}

public class Point1BoucleFor {
    public static void main(String[] args) {
        // Pour i allant de 0 à 12 pas 1
        for(var nombre=2;nombre<=10;nombre++){
            var carre=Math.pow(nombre,2);
            System.out.printf("Le carré %d est %f.\n",nombre,carre);
        }

        System.out.println("\n\n");

        // PRE INCREMENTATION
        // a = 3
        int a=3;

        // a = a+1 (a+=1) => a = 3 + 1 = 4
        // b = a => b = 4
        // a = 4, b = 4
        int b=++a;
        System.out.println("a = "+a);
        System.out.println("b = "+b);


        // POST INCREMENTATION
        // x = 3
        int x=3;

        // y = x => y = 3
        // x++ => x = x + 1(x +=1) => x = 3 + 1 = 4
        int y=x++;
        System.out.println("x = "+x);
        System.out.println("y = "+y);

        // x++/++x
        // x = x + 1 | x +=1 <=> x = x + 2 | x +=2

    }
}

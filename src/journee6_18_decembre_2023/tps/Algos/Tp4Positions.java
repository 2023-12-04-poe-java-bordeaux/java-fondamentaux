package journee6_18_decembre_2023.tps.Algos;

public class Tp4Positions {
    public static String findPositions(int[][] tab, int num) {

        int count = 0;
        String positions = "";

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                if(tab[i][j] == num) {
                    count++;
                    positions += "(" + i + "," + j + "), ";
                }
            }
        }

        if(count == 0) {
            return num + " ne se trouve pas dans le tableau";
        }
        else {
            return num + " se retrouve " + count + " fois dans les emplacements suivants : " + positions.substring(0, positions.length()-2);
        }
    }

    public static void main(String[] args) {
        int[][] tab = {{1, 4, 2, 1}, {6, 3, 8, 9}, {1, 5, 1, 0}};

        String result = findPositions(tab, 1);
        System.out.println(result);
    }
}

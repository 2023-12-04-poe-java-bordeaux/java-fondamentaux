package journee3_13_decembre_2023.cours;

public class Point4Methodes {

    static double calculateSum(double[] grades){
        double sum=0;
        for (int i=0;i<grades.length;i++) {
            sum +=grades[i];
        }
//        for (double grade:grades) {
//            sum +=grade;
//        }
        return sum;
    }
    public static void main(String[] args) {

        // Physics
        double[] physicsGrades={12,11,8,2,7};

        double physicsGradesSum=calculateSum(physicsGrades);

        double physicsGradesAverage=physicsGradesSum/physicsGrades.length;
        System.out.printf("Physics grade sum : %.2f\n",physicsGradesSum);
        System.out.printf("Physics grade Average : %.2f\n",physicsGradesAverage);


        // Geometry
        double[] geometryGrades={15,13.5,19,11,13};

        double geometryGradesSum=calculateSum(geometryGrades);

        double geometryGradesAverage=geometryGradesSum/geometryGrades.length;
        System.out.printf("Geometry grade sum : %.2f\n",geometryGradesSum);
        System.out.printf("Geometry grade Average : %.2f\n",geometryGradesAverage);

        // History
        double[] historyGrades={19,12.3,13,2,17};
        double historyGradesSum=calculateSum(historyGrades);

        double historyGradesAverage=historyGradesSum/historyGrades.length;
        System.out.printf("History grade sum : %.2f\n",historyGradesSum);
        System.out.printf("History grade Average : %.2f\n",historyGradesAverage);
    }
}

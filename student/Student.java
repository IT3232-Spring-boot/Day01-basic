package student;
public class Student {
    public static void main(String[] args) {

        int[] marks1 = {25,25,25,25};
        int[] marks2 = {50,50,50,50};
        int[] marks3 = {40,89,76,90};
        int[] marks4 = {35,55,60,30};

        StuDetails s1 = new StuDetails("mini",marks1);
        StuDetails s2 = new StuDetails("min",marks2);
        StuDetails s3 = new StuDetails("mi",marks3);
        StuDetails s4 = new StuDetails("m",marks4);

        StuDetails stuArray[] = new StuDetails[4];

        stuArray[0] = s1;
        stuArray[1] = s2;
        stuArray[2] = s3;
        stuArray[3] = s4;

        for(int i = 0; i < stuArray.length; i++) {
            System.out.print(stuArray[i].getName());
            System.out.print(" = ");
            System.out.println(stuArray[i].getAverage());
        }
    }
}
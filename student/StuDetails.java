package student;
public class StuDetails extends Student {

    private String stuName;
    private int[] stuMarks;

    StuDetails(String stuName,
                int[] stuMarks) {
        this.stuName = stuName;
        this.stuMarks = stuMarks;
    }

    public String getName() {
        return stuName;
    }

    public int getAverage() {
        int total = 0;
        for(int i = 0; i < stuMarks.length; i++) {
            total = total + stuMarks[i];
        }

        return (total / stuMarks.length);
    }
}
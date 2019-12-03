/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Student student=new Student();
        student.setName("Saghar");
        student.setSurName("Souri");
        student.setId("97400003");
        student.setDepartmentId("elm va sanat");
        student.setEntranceYear("1397-98");

        /**
         * first course validation
         */
        student.courseGrade[0][0]=1f;
        student.courseGrade[0][1]=3f;
        student.courseGrade[0][2]=8f;
        student.courseGrade[0][3]=13f;
        student.courseGrade[0][4]=16f;
        student.courseGrade[0][5]=18f;
        student.courseGrade[0][6]=14f;
        /**
         * second course validation
         */
        student.courseGrade[1][0]=2f;
        student.courseGrade[1][1]=12f;
        student.courseGrade[1][2]=16f;
        student.courseGrade[1][3]=19f;
        student.courseGrade[1][4]=17f;
        student.courseGrade[1][5]=9.5f;
        student.courseGrade[1][6]=4f;
        student.courseGrade[1][7]=15f;
        student.courseGrade[1][8]=17.25f;

        System.out.println(student.toString());
        student.calculationAverage();
        System.out.println("---------------");
        student.classify();

    }
}


public class Student {
    private String id;
    private String name;
    private String surName;
    private String departmentId;
    private String entranceYear;
    /**
     * students have 14 course.
     */
    public Float [][] courseGrade=new Float[10][10];



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getEntranceYear() {
        return entranceYear;
    }

    public void setEntranceYear(String entranceYear) {
        this.entranceYear = entranceYear;
    }

    public Float[][] getCourseGrade() {
        return courseGrade;
    }

    public void setCourseGrade(Float[][] courseGrade) {
        this.courseGrade = courseGrade;
    }

    public void calculationAverage()
    {
        float sum = 0;
        int number = 0;
        for (int i=0;courseGrade[i][0] !=null;i++)
        {
            number=0;
            sum=0;
            for (int j=0;courseGrade[i][j]!=null;j++)
            {
                sum+=courseGrade[i][j];
                number++;
            }
            System.out.println("course : "+(i+1)+" average : "+sum/number);
        }
    }

    public void classify()
    {
        for (int i=0;courseGrade[i][0] !=null;i++)
        {
            System.out.println("course : "+(i+1)+":");
            System.out.println("A:");
            for (int j=0;courseGrade[i][j]!=null;j++)
            {

                if (courseGrade[i][j]>15 && courseGrade[i][j]<=20){
                    System.out.println(courseGrade[i][j]);
                }
            }
            System.out.println("B:");
            for (int j=0;courseGrade[i][j]!=null;j++)
            {

                if (courseGrade[i][j]>10 && courseGrade[i][j]<=15){
                    System.out.println(courseGrade[i][j]);
                }
            }
            System.out.println("C:");
            for (int j=0;courseGrade[i][j]!=null;j++)
            {

                if (courseGrade[i][j]>5 && courseGrade[i][j]<=10){
                    System.out.println(courseGrade[i][j]);
                }
            }
            System.out.println("D:");
            for (int j=0;courseGrade[i][j]!=null;j++)
            {
                if (courseGrade[i][j]>=0 && courseGrade[i][j]<=5){
                    System.out.println(courseGrade[i][j]);
                }
            }
        }
    }

    @Override
    public String toString() {
        return  "id:" + id + '\n' +
                "name:" + name + '\n' +
                "surName:" + surName + '\n' +
                "departmentId:" + departmentId + '\n' +
                "entranceYear:" + entranceYear + '\n';
    }
}

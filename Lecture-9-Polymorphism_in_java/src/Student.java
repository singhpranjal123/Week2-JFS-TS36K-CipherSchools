
public class Student {
    private int standard;
    private String rollNo;
    private String section;


    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    // Getter and Setter methods for RollNo
    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    // Getter and Setter methods for Section
    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
    Student student = new Student();
student.setStandard(10);
student.setRollNo("1234");
student.setSection("A");

System.out.println("Standard: " + student.getStandard());
System.out.println("Roll No: " + student.getRollNo());
System.out.println("Section: " + student.getSection());
}

// Write a java programe to create class named student. Create variable name, rollno, marks. Initialize the object using default constructor. Create function like setName(), setRoll(), setMarks(), show().

class Student {
    private String name;
    private String roll_no;
    private double marks;
    public Student() {
        this.name = "Not Set";
        this.roll_no = "Not Set";
        this.marks = 0;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setRoll(String roll_no) {
        this.roll_no = roll_no;
    }
    public void setMarks(double marks) {
        this.marks = marks;
    }
    public void show() {
        System.out.println("Name: " + this.name + ", Roll No.: " + this.roll_no + ", Marks: " + this.marks);
    }
}
public class Thirteen {
    public static void main(String[] args) {
        Student std = new Student();
        std.show();
        std.setName("Anurag  Vishwakarma");
        std.setRoll("21017C04014");
        std.setMarks(99.12);
        std.show();
    }
}


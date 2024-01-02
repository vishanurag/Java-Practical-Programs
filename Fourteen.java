// Write Multiple Constructor for Student class and also use “this” keyword in the program.

class Student {
    private String name;
    private String roll_no;
    private double marks;
    // default constructor...
    public Student() {
        this.name = "Not Set";
        this.roll_no = "Not Set";
        this.marks = 0;
    }
    //an overloaded constructor for storing all 3 values in this class instance...
    public Student(String name, String roll, double marks) {
        this.name = name;
        this.roll_no = roll;
        this.marks = marks;
    }
    public void show() {
        System.out.println("Name: " + this.name + ", Roll No.: " + this.roll_no + ", Marks: " + this.marks);
    }
}
public class Fourteen {
    public static void main(String[] args) {
        Student std1 = new Student();
        std1.show();
        Student std2 = new Student("Anurag  Vishwakarma", "21017C04014", 99.7);
        std2.show();
    }
}



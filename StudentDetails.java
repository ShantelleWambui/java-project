public class StudentDetails {
    private String name;
    private int age;
    private String course;

    // Constructor to initialize student details
    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.gender = gender;
    }

    // Method to render/display student details
    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("Gender: " + gender);
    }

    public static void main(String[] args) {
        // Creating an instance of the Student class and invoking the displayDetails method
        Student student = new StudentDetails("Shantelle Wambui", 20, "Computer Science", "Female");
        student.displayDetails();
    }
}
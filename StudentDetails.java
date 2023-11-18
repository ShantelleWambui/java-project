public class StudentDetails {
    private String name;
    private int age;
    private String course;
    private String gender;

    // Constructor to initialize student details
    public StudentDetails(String name, int age, String course, String gender) {
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
        StudentDetails student = new StudentDetails("Shantelle Wambui", 20, "Computer Science", "Female");
        student.displayDetails();
    }
}

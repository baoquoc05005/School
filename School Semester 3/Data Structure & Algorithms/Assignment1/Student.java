// Student class 
public class Student extends Person {
    // Constructor to initialize Student's name
    public Student(String firstName, String lastName) {
        super(firstName, lastName, "Student");
    }

    // Student attends all the hours
    @Override
    public int getParticipatingHours(int courseHours) {
        return courseHours; // This is All hours for Student
    }
}

//Name: Tran Truong Quoc Bao
//StudentID: N01625416
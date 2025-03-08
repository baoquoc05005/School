// Professor class extends Person and implements absract method
public class Professor extends Person {
    // Constructor 
    public Professor(String firstName, String lastName) {
        super(firstName, lastName, "Professor");
    }

    // Because Professor only attends the lecture hours which mean total hours - lab hours
    @Override
    public int getParticipatingHours(int courseHours) {
        // If course > 4 hours, the professor has 2 lab hours, the rest is lecture hours
        int labHours = (courseHours > 4) ? 2 : 1;
        return courseHours - labHours; // This mean lecture hours for Professor
    }
}

//Name: Tran Truong Quoc Bao
//StudentID: N01625416
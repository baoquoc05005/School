
// TA class
public class TA extends Person {
    // Constructor 
    public TA(String firstName, String lastName) {
        super(firstName, lastName, "TA");
    }
    // TA conducts lab hours
    @Override
    public int getParticipatingHours(int courseHours) {
        // If the course is more than 4 hours, the TA has 2 lab hours, otherwise 1
        return (courseHours > 4) ? 2 : 1; // Lab hours for TA
    }
}
//Name: Tran Truong Quoc Bao
//StudentID: N01625416
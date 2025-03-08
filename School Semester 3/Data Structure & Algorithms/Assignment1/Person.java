// Abstract class (Professor, TA, or Student)
public abstract class Person implements ParticipateHours {
    String firstName;
    String lastName;
    String role;
    // Constructor
    public Person(String firstName, String lastName, String role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }
    // Abstract method
    public abstract int getParticipatingHours(int courseHours);
}


//Name: Tran Truong Quoc Bao
//StudentID: N01625416

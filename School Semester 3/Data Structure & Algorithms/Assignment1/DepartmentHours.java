public class DepartmentHours {
    public static void main(String[] args) {
        // Input records as an array of strings
        String[] records = {
            "Professor Isaac Newton Physics 6",
            "TA Marie Curie Physics 6",
            "Professor Isaac Newton Calculus 4",
            "Student Amy Adams Calculus 4",
            "Student Will Smith Calculus 4",
            "Student Brad Pitt Physics 6",
            "Student Will Smith Physics 6",
            "Professor Dmitri Mendeleev Chemistry 6",
            "TA Carl Gauss Calculus 4",
            "Student Amy Adams Economics 3",
            "Professor Adam Smith Economics 3",
            "TA Marie Curie Chemistry 6",
            "Student Brad Pitt Chemistry 6",
            "Student Will Smith Chemistry 6"
        };

        // Array to store all Person objects
        Person[] people = new Person[records.length];

        // Process the records and create Person objects
        for (int i = 0; i < records.length; i++) {
            String[] parts = records[i].split(" ");  

            // I extract each pieces of information 
            String role = parts[0];  // Role: Professor, TA, or Student
            String firstName = parts[1];
            String lastName = parts[2];
            String courseName = parts[3];  
            int courseHours = Integer.parseInt(parts[4]);  // Convert course hours to integer

            // Create the Person object based on the role
            if (role.equals("Professor")) {
                people[i] = new Professor(firstName, lastName);
            } else if (role.equals("TA")) {
                people[i] = new TA(firstName, lastName);
            } else if (role.equals("Student")) {
                people[i] = new Student(firstName, lastName);
            }

            // Get the participating hours for each person and print the result
            int totalHours = people[i].getParticipatingHours(courseHours);
            System.out.println(people[i].role + " " + firstName + " " + lastName + " " + totalHours);
        }
    }
}

//Name: Tran Truong Quoc Bao
//StudentID: N01625416
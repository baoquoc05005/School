# I create dictionary objects that contains students' information

students = {
    "1": {
        "name": "John",
        "age": "20",
        "school_name": "UofT",
        "completed_courses": {
            "CSC148": 85,
            "CSC165": 90,
            "CSC207": 80
            },
         "ongoing_courses": {
            "CSC135": 78,
            "CSC158": 65,
            "CSC215": 88
            }
        },
    "2": {
        "name": "Jane",
        "age": "21",
        "school_name": "UofT",
        "completed_courses": {
            "CSC018": 80,
            "CSC165": 75,
            "CSC207": 59
            },
         "ongoing_courses": {
            "CSC135": 78,
            "CSC158": 65,
            "CSC215": 88
            }
        },
    "3": {
        "name": "Jack",
        "age": "22",
        "school_name": "UofT",
        "completed_courses": {
            "CSC148": 85,
            "CSC165": 90,
            "CSC207": 80
            },
         "ongoing_courses": {
            "CSC135": 78,
            "CSC158": 65,
            "CSC215": 88
            }
        }
    }
# On program, I ask user if they would like to:

while True:
    print("\nPlease select one of the following options:")
    print("1. View all students' information")
    print("2. View all information on specific student")
    print("3. View all ongoing grades of specific student")
    print("4. View all completed grades of specific student")
    print("5. View average completed grades of student")
    print("6. View specific grade of specific student")
    print("7. Exit the program")
    user_input = input("\nPlease enter your selection: ")

    # 1. This is to biew all students' information
    if user_input == "1":
        for student_id in students:
            print("\nStudent ID:", student_id)
            print("Name:", students[student_id]["name"])
            print("Age:", students[student_id]["age"])
            print("School Name:", students[student_id]["school_name"])
            print("Completed Courses:", students[student_id]["completed_courses"])
            print("Ongoing Courses:", students[student_id]["ongoing_courses"])

    # 2. View all information on specific student, ask for id if selected
    elif user_input == "2":
        student_id = input("\nPlease enter the student ID: ")
        if student_id in students:
            print("\nStudent ID:", student_id)
            print("Name:", students[student_id]["name"])
            print("Age:", students[student_id]["age"])
            print("School Name:", students[student_id]["school_name"])
            print("Completed Courses:", students[student_id]["completed_courses"])
            print("Ongoing Courses:", students[student_id]["ongoing_courses"])
        else:
            print("\nStudent ID does not exist.")

    # 3. View all ongoing grades of specific student, ask for id if selected
    elif user_input == "3":
        student_id = input("\nPlease enter the student ID: ")
        if student_id in students:
            print("\nStudent ID:", student_id)
            print("Ongoing Courses:", students[student_id]["ongoing_courses"])
        else:
            print("\nStudent ID does not exist.")

    # 4. View all completed grades of specific student, ask for id if selected
    elif user_input == "4":
        student_id = input("\nPlease enter the student ID: ")
        if student_id in students:
            print("\nStudent ID:", student_id)
            print("Completed Courses:", students[student_id]["completed_courses"])
        else:
            print("\nStudent ID does not exist.")

    # 5. View average completed grades of student, ask for id if selected
    elif user_input == "5":
        student_id = input("\nPlease enter the student ID: ")
        if student_id in students:
            print("\nStudent ID:", student_id)
            print("Average Completed Grade:", round(sum(students[student_id]["completed_courses"].values()) / len(students[student_id]["completed_courses"]),2))
        else:
            print("\nStudent ID does not exist.")

    # 6. View specific grade of specific student, ask for id and course name
    elif user_input == "6":
        student_id = input("\nPlease enter the student ID: ")
        if student_id in students:
            course_name = input("\nPlease enter the course name: ")
            if course_name in students[student_id]["completed_courses"]:
                print("\nStudent ID:", student_id)
                print("Course Name:", course_name)
                print("Grade:", students[student_id]["completed_courses"][course_name])
            else:
                print("\nCourse name does not exist.")
        else:
            print("\nStudent ID does not exist.")

    # 7. Exit program
    elif user_input == "7":
        print("\nThank you for using the program.")
        break

    # Include error handling if user id or course name does not exist
    else:
        print("\nInvalid input. Please try again.")
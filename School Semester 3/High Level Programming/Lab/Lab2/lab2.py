def fizz_buzz_program():
    while True:  # Step 9 - Loop continues until user opts to exit
        num_elements = int(input("Enter the number of elements: "))  # Step 1

        # Counter variables
        num_fizz = 0
        num_buzz = 0
        num_fizz_buzz = 0

        # Step 2 - Loop over the range of num_elements
        for i in range(1, num_elements + 1):
            output = f"Iteration {i}: "  # Step 3

            # Step 4 & 5 - Check if divisible by 3 or 5
            if i % 3 == 0 and i % 5 == 0:
                output += "FizzBuzz"
                num_fizz_buzz += 1  # Step 7
            elif i % 3 == 0:
                output += "Fizz"
                num_fizz += 1  # Step 7
            elif i % 5 == 0:
                output += "Buzz"
                num_buzz += 1  # Step 7
            else:
                output += str(i)

            print(output)  # Step 3 - Output the result

        # Step 8 - After loop, print the number of occurrences
        print(f"Fizz: {num_fizz}")
        print(f"Buzz: {num_buzz}")
        print(f"FizzBuzz: {num_fizz_buzz}")

        # Step 9 - Ask the user if they want to exit
        exit_choice = input("Would you like to exit the program? (yes/no): ").strip().lower()
        if exit_choice == 'yes':
            break

fizz_buzz_program()  # Calling the function to start the program

#I create an empty list and request user input 
nums = []
while True:
    try:
        #Insert number or list of numbers into nums
        user_input = input("Enter a number or a list of numbers (comma-separated): ")
        if ',' in user_input:
            # If input is a list, split and convert to integers
            nums.extend(map(int, user_input.split(',')))
        else:
            # If input is a single number, append to list
            nums.append(int(user_input))
    except ValueError:
        print("Invalid input. Please enter numbers only.")
        continue

    #This is to confirm users wants to continue or not
    another = input("Would you like to enter another number? (yes/no): ").strip().lower()
    if another != 'yes':
        break

#5: This will iterate over numbers and determine max and min
if nums:  # I check if the list is not empty
    max_num = nums[0]
    min_num = nums[0]

    for num in nums:
        if num > max_num:
            max_num = num
        if num < min_num:
            min_num = num

    #Display results
    print("\nNumbers entered:", nums)
    print("Maximum number:", max_num)
    print("Minimum number:", min_num)
else:
    print("No numbers entered.")

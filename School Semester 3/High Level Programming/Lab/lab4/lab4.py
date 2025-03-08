import random

def get_range_and_random():
    """Get user input for min and max range and generate a random number."""
    while True:
        try:
            min_num = int(input("Enter the minimum number: "))
            max_num = int(input("Enter the maximum number: "))
            if min_num >= max_num:
                print("Minimum number must be less than the maximum number. Try again.")
                continue
            random_number = random.randint(min_num, max_num)
            return min_num, max_num, random_number
        except ValueError:
            print("Invalid input. Please enter valid integers.")

def print_statistics(total_wins, total_games):
    """Print win statistics and ask if the user wants to reset them."""
    if total_games > 0:
        win_percentage = (total_wins / total_games) * 100
    else:
        win_percentage = 0
    print(f"Games won: {total_wins}")
    print(f"Total games: {total_games}")
    print(f"Win percentage: {win_percentage:.2f}%")

    while True:
        reset_stats = input("Would you like to reset statistics? (yes/no): ").strip().lower()
        if reset_stats in ["yes", "no"]:
            return reset_stats == "yes"
        print("Invalid input. Please enter 'yes' or 'no'.")

def play_game():
    """Main function to run the game."""
    total_wins = 0
    total_games = 0

    while True:
        min_num, max_num, random_number = get_range_and_random()

        print(f"Guess the random number between {min_num} and {max_num}!")

        while True:
            try:
                guessed_number = int(input("Enter your guessed number: "))
                break
            except ValueError:
                print("Invalid input. Please enter a valid integer.")

        total_games += 1

        if guessed_number == random_number:
            print("Congratulations! You guessed the correct number.")
            total_wins += 1
        else:
            print(f"Sorry, the correct number was {random_number}.")

        print_statistics(total_wins, total_games)

        if input("Would you like to play again? (yes/no): ").strip().lower() != "yes":
            break

        if print_statistics(total_wins, total_games):
            total_wins = 0
            total_games = 0

    print("Thanks for playing!")

if __name__ == "__main__":
    play_game()

#Exercise 1

# Get the three test scores
test1 = float(input("Enter the first test score: "))
test2 = float(input("Enter the second test score: "))
test3 = float(input("Enter the third test score: "))

# Calculate the average
average = (test1 + test2 + test3) / 3

# Display the average
print(f"Your average test score is: {average:.2f}")

# Congratulate the user if the average is greater than 95
if average > 95:
    print("Congratulations! You did an amazing job!")


#Exercise 2
# Get the user's age
age = int(input("Enter the person's age: "))

# Classify the person based on age
if age <= 1:
    print("This person is an infant.")
elif 1 < age < 13:
    print("This person is a child.")
elif 13 <= age < 20:
    print("This person is a teenager.")
else:
    print("This person is an adult.")


#Exercise 3
# Get the price of each item
item1 = float(input("Enter the price of item 1: "))
item2 = float(input("Enter the price of item 2: "))
item3 = float(input("Enter the price of item 3: "))
item4 = float(input("Enter the price of item 4: "))
item5 = float(input("Enter the price of item 5: "))

# Calculate the subtotal
subtotal = item1 + item2 + item3 + item4 + item5

# Calculate the sales tax (7%)
sales_tax = subtotal * 0.07

# Calculate the total
total = subtotal + sales_tax

# Display the results
print(f"Subtotal: ${subtotal:.2f}")
print(f"Sales Tax: ${sales_tax:.2f}")
print(f"Total: ${total:.2f}")

#Exercise 4
# Constants
shares_purchased = 2000
purchase_price_per_share = 40.00
commission_rate = 0.03

# Calculate the amount paid for the stock
amount_paid = shares_purchased * purchase_price_per_share

# Calculate the commission paid when buying the stock
commission_paid_buying = amount_paid * commission_rate

# Constants for selling
selling_price_per_share = 42.75

# Calculate the amount received from selling the stock
amount_received = shares_purchased * selling_price_per_share

# Calculate the commission paid when selling the stock
commission_paid_selling = amount_received * commission_rate

# Calculate the total commission paid
total_commission = commission_paid_buying + commission_paid_selling

# Calculate the net profit or loss
net_profit = amount_received - amount_paid - total_commission

# Display the results
print(f"Amount paid for the stock: ${amount_paid:.2f}")
print(f"Commission paid when buying: ${commission_paid_buying:.2f}")
print(f"Amount received from selling the stock: ${amount_received:.2f}")
print(f"Commission paid when selling: ${commission_paid_selling:.2f}")
print(f"Net profit/loss: ${net_profit:.2f}")
#Exercise 5 
# Get user input
principal = float(input("Enter the principal amount: "))
annual_interest_rate = float(input("Enter the annual interest rate (as a percentage): "))
compounding_frequency = int(input("Enter the number of times interest is compounded per year: "))
years = float(input("Enter the number of years: "))

# Convert the interest rate to a decimal
r = annual_interest_rate / 100

# Calculate the final amount
A = principal * (1 + r / compounding_frequency) ** (compounding_frequency * years)

# Display the result
print(f"The amount of money in the account after {years} years is: ${A:.2f}")
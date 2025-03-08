#Exercise 1
def calculate_auto_expenses():
    print("Enter your monthly automobile expenses:")
    
    loan = float(input("Loan payment: $"))
    insurance = float(input("Insurance: $"))
    gas = float(input("Gas: $"))
    oil = float(input("Oil: $"))
    tires = float(input("Tires: $"))
    maintenance = float(input("Maintenance: $"))

    monthly_total = loan + insurance + gas + oil + tires + maintenance
    annual_total = monthly_total * 12

    print(f"\nTotal Monthly Cost: ${monthly_total:.2f}")
    print(f"Total Annual Cost: ${annual_total:.2f}")

calculate_auto_expenses()

#Exercise 2
def calculate_ticket_income():
    print("Enter the number of tickets sold for each class:")
    
    class_a = int(input("Class A ($20 per ticket): "))
    class_b = int(input("Class B ($15 per ticket): "))
    class_c = int(input("Class C ($10 per ticket): "))

    total_income = (class_a * 20) + (class_b * 15) + (class_c * 10)

    print(f"\nTotal Income from Ticket Sales: ${total_income:.2f}")

calculate_ticket_income()


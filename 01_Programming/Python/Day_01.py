first_number = int(input("Enter your first Number: "))
second_number = int(input("Enter your second Number: "))
if first_number > second_number:
    print("The first number is greater than the second number and can be divisible by the second number.")
    print("Do you want to Devide this No. ", first_number, " by ", second_number, "?")
    if input("Enter 'yes' or 'no': ") == "yes":
        print("The result of the division is: ", first_number / second_number)

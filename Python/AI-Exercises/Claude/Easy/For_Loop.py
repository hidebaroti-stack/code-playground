##Print the multiplication table of a number entered by the user (1× to 10×).
number = int(input("Enter the number: "))
print("Multiplication table of", number, ":")

for i in range (1, 11):
    print(number, "x", i,"=", number * i)
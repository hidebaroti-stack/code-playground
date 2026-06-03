##Ask the user for two numbers. Print their sum, product, and which is larger.

number1 = int(input("Enter the first number: "))
number2 = int(input("Enter the second number: "))

sum = number1 + number2
print("The sum of the two numbers: ",sum)
product = number1 * number2
print("The product of the two numbers: ",product)

if(number1 > number2): print(number1, "is the larger number.")
elif(number2 > number1): print(number2, "is the larger number.")
else: print("Both numbers are equal.")
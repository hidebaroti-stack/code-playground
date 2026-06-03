##Ask the user to enter 5 numbers one by one, store them in a list. Print the list, its sum, maximum, and minimum.

numbers = []
for _ in range(5):
    num = int(input("Enter a number: "))
    numbers.append(num)

print("Numbers entered: ",numbers)
print("Sum: ", sum(numbers))
print("Maximum: ", max(numbers))
print("Minimum: ", min(numbers))
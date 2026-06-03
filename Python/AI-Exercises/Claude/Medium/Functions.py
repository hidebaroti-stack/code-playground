##Write a function is_prime(n) that returns True if n is prime, False otherwise. Test it on at least 5 numbers.
def is_prime(number):
    if number <= 1:
        return False
    for i in range(2, int(number**0.5) + 1):
        if number % i == 0:
            return False
    return True

# Test the function on at least 5 numbers
test_numbers = []
for _ in range(5):
    num = int(input("Enter a number: "))
    test_numbers.append(num)

for num in test_numbers:
    if is_prime(num):
        print(num, "is a prime number.")
    else:
        print(num, "is not a prime number.")
##Keep asking the user to guess a secret number (42). Count the attempts. When correct, print 'Correct! You guessed in N tries.'

secret_number = 42;
attempts = 0;
 
while True:
    guess = int(input("Guess the secret number: "))
    attempts += 1

    if guess == secret_number: 
        print("Correct!You guessed in", attempts, "tries.")
        break

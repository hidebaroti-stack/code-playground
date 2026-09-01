#include <stdio.h>

// Task 2: Write a C program that takes a string input from the user and prints it back.
int main()
{
    char str[100];
    printf("Enter a string: ");
    fgets(str, sizeof(str), stdin); // use fgets to read a string with spaces
    printf("You entered: %s", str);
    return 0;
}
/*Write a C program to input a character and check that it’s a small letter,
capital letter, a digit or a special symbol.*/

#include <stdio.h>

int main()
{
    char c;

    printf("Enter a character: ");
    scanf("%c", &c);

    if (c >= 'a' && c <= 'z')
        printf("Small letter.");
    else if (c >= 'A' && c <= 'Z')
        printf("Capital letter.");
    else if (c >= '0' && c <= '9')
        printf("A digit.");
    else
        printf("Special symbol.");
}
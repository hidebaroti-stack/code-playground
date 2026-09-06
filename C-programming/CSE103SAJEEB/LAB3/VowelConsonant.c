/*Write a C program to input a character and check that it’s a vowel or a
consonant.*/

#include <stdio.h>

int main()
{
    char c;

    printf("Enter a character: ");
    scanf("%c", &c);

    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
        c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
        printf("Vowel.");
    else
        printf("Consonant.");
}
/*Write a C program to input a number and check whether it is positive or
negative.*/

#include <stdio.h>

int main()
{
    int num;

    printf("Enter an integer: ");
    scanf("%d", &num);

    if (num > 0)
        printf("Positive number.");
    else if (num < 0)
        printf("Negative number.");
    else
        printf("Number is zero.");
}
/*Write a C program to input a number. If the number is even, print its square
otherwise print its cube.*/

#include <stdio.h>

int main()
{
    int num;

    printf("Enter an integer: ");
    scanf("%d", &num);

    if (num % 2 == 0)
        printf("Square as being Even: %d", num * num);
    else
        printf("Cube as being Odd: %d", num * num * num);
}
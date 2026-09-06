/*Write a C program to input a number and check whether it is even or odd.*/

#include <stdio.h>

int main()
{
    int num;

    printf("Enter an integers: ");
    scanf("%d", &num);

    if (num == 0)
        printf("Not Even or Odd.");
    else if (num % 2 == 0)
        printf("Even.");
    else
        printf("Odd.");
}
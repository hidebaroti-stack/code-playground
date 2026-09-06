/*Write a C program to accept two integers and check whether they are
equal or not.*/

#include <stdio.h>

int main()
{
    int int1;
    int int2;

    printf("Enter 2 integers: ");
    scanf("%d %d", &int1, &int2);

    if (int1 == int2)
        printf("They are equal.");
    else
        printf("Not equal.");
}
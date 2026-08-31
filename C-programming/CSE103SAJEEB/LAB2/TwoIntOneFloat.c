/* 1. Write a program to declare two integer and one float variables then initialize them to
10, 15, and 12.6. Also print the variable values on the screen */

#include <stdio.h>

int main()
{
    int x;
    int y;
    float z;

    x = 10;
    y = 15;
    z = 12.5;

    printf("Two Integers & One Float: %d, %d & %.2f", x, y, z);
    return 0;
}
/*Write a C program to accept a coordinate point in a XY coordinate system
and determine in which quadrant the coordinate point lies.*/

#include <stdio.h>

int main()
{
    int x;
    int y;

    printf("Enter x and y: ");
    scanf("%d %d", &x, &y);

    if (x > 0 && y > 0)
        printf("1st quadrant.");
    else if (x < 0 && y > 0)
        printf("2nd quadrant.");
    else if (x < 0 && y < 0)
        printf("3rd quadrant.");
    else if (x > 0 && y < 0)
        printf("4th quadrant.");
    else
        printf("Origin.");
}
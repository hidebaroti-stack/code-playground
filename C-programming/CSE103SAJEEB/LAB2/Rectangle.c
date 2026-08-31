/*2. Write a C program to compute the perimeter and area of a rectangle with a height of
7 inches and width of 5 inches.*/

#include <stdio.h>

int main()
{
    int height = 7;
    int width = 5;

    float area = height * width;
    float perimeter = 2 * (height + width);

    printf("Area: %.2f\n", area);
    printf("Perimeter: %.2f", perimeter);

    return 0;
}
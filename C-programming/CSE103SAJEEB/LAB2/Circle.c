/*5. Write a C program to compute the perimeter and area of a circle with a given radius.*/

#include <stdio.h>

int main()
{
    int radius;
    float PI = 3.1416;

    printf("Enter the radius: ");
    scanf("%d", &radius);

    float perimeter = 2 * PI * radius;
    printf("Perimeter: %.2f", perimeter);

    float area = PI * radius * radius;
    printf("\nArea: %.2f", area);

    return 0;
}
/*6. Write a C program that prints the perimeter of a rectangle using its height and width
as inputs.*/

#include <stdio.h>

int main()
{
    int height;
    int width;

    printf("Enter the height: ");
    scanf("%d", &height);

    printf("Enter the width: ");
    scanf("%d", &width);

    float perimeter = 2 * (height + width);

    printf("Perimeter: %.2f", perimeter);

    return 0;
}
/*4. Write a C program that calculates the volume of a sphere.*/

#include <stdio.h>

int main()
{
    int radius;
    float PI = 3.1416;

    printf("Enter the radius: ");
    scanf("%d", &radius);

    float volume = ((float)4 / 3) * PI * (radius * radius * radius);
    printf("Volume of sphere: %.2f", volume);

    return 0;
}
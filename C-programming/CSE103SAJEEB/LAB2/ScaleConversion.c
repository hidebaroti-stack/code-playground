/*3. Write a program that converts Centigrade to Fahrenheit.*/

#include <stdio.h>

int main()
{
    float centigrade;

    printf("Enter temperature in Centigrade: ");
    scanf("%f", &centigrade);

    float fahrenheit = (centigrade * 9 / 5) + 32;
    printf("Temperature in Fahrenheit: %.2f\n", fahrenheit);

    return 0;
}
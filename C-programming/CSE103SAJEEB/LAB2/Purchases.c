/*8. Write a C program that accepts two item's weight and number of purchases (floating
point values) and calculates their average value.*/

#include <stdio.h>

int main()
{
    float weight1;
    float weight2;

    int purchase1;
    int purchase2;

    printf("Enter the weight of item 1: ");
    scanf("%f", &weight1);

    printf("Enter the number of purchases for item 1: ");
    scanf("%d", &purchase1);

    printf("Enter the weight of item 2: ");
    scanf("%f", &weight2);

    printf("Enter the number of purchases for item 2: ");
    scanf("%d", &purchase2);

    float average = (weight1 * purchase1 + weight2 * purchase2) / (purchase1 + purchase2);
    printf("Average value: %.2f\n", average);

    return 0;
}
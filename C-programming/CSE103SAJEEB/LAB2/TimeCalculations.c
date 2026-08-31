/*7. Write a C program that takes hours and minutes as input, and calculates the total
number of minutes.*/

#include <stdio.h>

int main()
{
    int hours;
    int minutes;

    printf("Enter the hours: ");
    scanf("%d", &hours);

    printf("Enter the minutes: ");
    scanf("%d", &minutes);

    int totalMinutes = (hours * 60) + minutes;
    printf("Total minutes: %d\n", totalMinutes);

    return 0;
}
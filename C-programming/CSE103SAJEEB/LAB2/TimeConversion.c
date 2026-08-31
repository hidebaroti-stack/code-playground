/*9. Write a C program to convert a given integer (in seconds) to hours, minutes and
seconds.*/

#include <stdio.h>

int main()
{
    int totalSeconds;

    printf("Enter the total seconds: ");
    scanf("%d", &totalSeconds);

    int hours = totalSeconds / 3600;
    int minutes = (totalSeconds % 3600) / 60;
    int seconds = totalSeconds % 60;

    printf("%d seconds = %d hours, %d minutes and %d seconds.\n", totalSeconds, hours, minutes, seconds);

    return 0;
}
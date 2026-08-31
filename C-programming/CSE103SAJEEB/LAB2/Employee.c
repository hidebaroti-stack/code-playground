/*10.Write a C program that accepts an employee's ID, total worked hours in a month and
the amount he received per hour. Print the ID and salary of the employee for a
particular month.*/

#include <stdio.h>

int main()
{
    int employeeId;
    int workedHours;
    float amountPerHour;

    printf("Enter the employee ID: ");
    scanf("%d", &employeeId);

    printf("Enter the total worked hours in a month: ");
    scanf("%d", &workedHours);

    printf("Enter the amount received per hour: ");
    scanf("%f", &amountPerHour);

    float salary = workedHours * amountPerHour;

    printf("Employee ID: %d\n", employeeId);
    printf("Salary for the month: %.2f\n", salary);

    return 0;
}
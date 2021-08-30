#include <stdio.h>
main()
{
    int income;
    printf("Enter Income\n");
    scanf("%i", &income);
    if (income <= 5)
    {
        printf("Income is Low\n");
    }
    else if (income > 5 && income <= 10)
    {
        printf("Income is medium\n");
    }
    else
    printf("income is High\n");
    return 0;
}
#include <stdio.h>

 main()
{
    int sum = 0, i, n;
    printf("Enter value of n\n");
    scanf("%d", &n);
    for (i = 1; i <= n; i++)
    {
        sum = sum + i;
    }
    printf("%d\n", sum);
}
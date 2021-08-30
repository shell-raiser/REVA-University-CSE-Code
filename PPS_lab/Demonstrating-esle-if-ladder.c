#include <stdio.h>
main()
{
    int a, b;
    printf("Enter value of a and b\n");
    scanf("%d%d", &a, &b);
    if (a == b)
    printf("a is equal to b\n");
    else if (a > b)
    printf("a is greater than b\n");
    else
    printf("b is greater than a\n");
}
#include <stdio.h>
main()
{
    int a;
    printf("Enter your age\n");
    scanf("%d", &a);
    if (a > 18)
    printf("You are eligible\n");
    else
    printf("You are not eligible\n");
}
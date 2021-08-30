#include <stdio.h>
main()
{
    int a;
    printf("Enter your marks\n");
    scanf("%d", &a);
    if (a > 100 || a < 0)
    printf("Please enter between 0 to 100\n");
    else if (a >=80)
    printf("A grade\n");
    else if (a >= 60)
    printf("B grade\n");
    else if (a >= 40)
    printf("C grade\n");
    else
    printf("Fail\n");
}
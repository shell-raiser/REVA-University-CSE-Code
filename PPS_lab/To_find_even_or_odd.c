#include <stdio.h>
main()
{
    int a;
    printf("enter the number to find the number is even or odd");
    scanf("%d",&a);
    if (a%2 == 0)
    printf("%d is even", a);
    else
    printf("%d is odd", a);    
}
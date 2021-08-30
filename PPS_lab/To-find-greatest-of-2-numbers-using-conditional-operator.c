#include <stdio.h>
int main()
{
    int a, b, c;
    printf("enter values of a and b\n");
    scanf("%d%d", &a, &b);
    c = (a>b)?a:b;
    printf("%d is greater\n", c);
}
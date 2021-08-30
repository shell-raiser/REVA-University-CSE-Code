#include <stdio.h>
int main()
{   
    printf("First statement\n");
    goto L1;
    printf("Second statement\n");
    L1:
    printf("Third statement\n");
    printf("Fourth statement\n");
}
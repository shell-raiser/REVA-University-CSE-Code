#include <stdio.h>
main()
{
    int i, j, n, mid;
    n = 10;
    for(i = 1;i <= n; i+=2)
    {
        mid = n - (i/2) - 2;
        for(j=1;j<=mid;j++)
        {
            printf(" ");
        }
        for(j = 1; j<=i;j = j + 1)
        {
            printf("%c", 'A'+j-1);
        }
     
        printf("\n");
    }

}
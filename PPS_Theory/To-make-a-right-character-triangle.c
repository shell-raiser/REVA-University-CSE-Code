#include <stdio.h>
main()
{
    int i, j, n;
    n = 5;
    for(i = 1;i <= n; i++)
    {
        for(j=1;j<=i;j++)
        {
            printf("%c", 'A'+j-1);
        }
        printf("\n");
    }

}
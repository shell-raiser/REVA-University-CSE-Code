#include <stdio.h>
main()
{
    int i, j,k,n;
    n = 10;
    for(i = 1;i <= n; i++)
    {
        for(j=1;j<=i;j++)
        {
            printf("%c", 'A'+j-1);
        }
        printf("\n");
    }
    n = 10;
     for(i = 1;i <= n; i++)
    { 
        k=1;
        for(j=n;j>=i;j--)
        {
            printf("%c", 65+k-1);
            k++;
        }
        printf("\n");
    }

}
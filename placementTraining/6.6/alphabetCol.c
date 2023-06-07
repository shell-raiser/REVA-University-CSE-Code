#include <stdio.h>

int main(int argc, char const *argv[])
{
    int let = 'A';
    int n;
    scanf("%d", &n);
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j <=i; j++)
        {
            printf("%c", let + i);
        }
        printf("\n");
    }
    return 0;
}
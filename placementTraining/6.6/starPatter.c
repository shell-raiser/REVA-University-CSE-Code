// print
// ****
// ****
// ****

#include <stdio.h>

void printPattern(int n)
{
    for (int i = 0; i < n-1; i++)
    {
        for (int j = 0; j < n; j++)
        {
            printf("*");
        }
        printf("\n");
    }
}

int main(int argc, char const *argv[])
{
    int n;
    scanf("%d", &n);
    printPattern(n);
    return 0;
}

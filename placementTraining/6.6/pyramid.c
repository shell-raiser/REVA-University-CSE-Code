// print a pyramid of stars

#include <stdio.h>
void printPyramid(int n)
{
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n - i; j++)
        {
            printf(" ");
        }

        for (int j = 0; j < i + 1; j++)
        {
            printf("* ");
        }
        printf("\n");
    }
}
int main(int argc, char const *argv[])
{
    int n;
    scanf("%d", &n);
    printPyramid(n);
    return 0;
}

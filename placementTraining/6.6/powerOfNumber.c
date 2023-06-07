// using callbyvalue, calculate power of number

#include <stdio.h>
void power(int n, int base);
int main(int argc, char const *argv[])
{
    int n, bs;
    scanf("%d", &n);
    scanf("%d", &bs);
    power(n, bs);

    return 0;
}
void power(int n, int base)
{
    int result = 1;
    for (int i = 0; i < n; i++)
    {
        result *= base;
    }
    printf("%d", result);
}
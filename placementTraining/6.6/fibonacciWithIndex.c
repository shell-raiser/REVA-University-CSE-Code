// calculate fibonacci series upto 5 outputs, using recursion
#include <stdio.h>
int fib(int strt, int n);
int main(int argc, char const *argv[])
{
    /* code */
    int n, strt;
    scanf("%d", &strt);
    scanf("%d", &n);

    // printf("%d", n);
    // printf("%d", strt);

    printf("%d", fib(strt, n));
    // fib(strt, n);
    return 0;
}

int fib(int strt, int n)
{
    // printf("%d ", n);
    if (n == strt)
    {
        return strt;
    }
    else if (n == strt+1){
        return 2*strt+1;
    }
    else if (n == strt+2){
        return 3*strt+2;
    }
    else
    {
        return fib(strt, n - 1) + fib(strt, n - 2);
    }
    // return  fib(strt, n-1);
}
// find max ele in array, using func calling
// 11 24 100 1 15
#include <stdio.h>

void findMax(int arr[])
{
    int max = arr[0];
    for (int j = 1; j < 5; j++)
    {
        if (arr[j] > max)
        {
            max = arr[j];
        }
    }
    printf("max is %d", max);
}

void main(int argc, char const *argv[])
{
    int arr[5] = {11, 24, 100, 1, 15};
    findMax(arr);
}

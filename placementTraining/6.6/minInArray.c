// find min ele in array, using func calling
// 11 24 100 1 15
#include <stdio.h>

void findMin(int arr[])
{
    int min = arr[0];
    for (int j = 1; j < 5; j++)
    {
        if (arr[j] < min)
        {
            min = arr[j];
        }
    }
    printf("min is %d", min);
}

void main(int argc, char const *argv[])
{
    int arr[5] = {11, 24, 100, 1, 15};
    findMin(arr);
}

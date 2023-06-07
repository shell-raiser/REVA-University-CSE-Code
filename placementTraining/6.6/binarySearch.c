#include <stdio.h>
#include <stdlib.h>

void binarySearch(int arr[], int n, int size)
{
    if (size <= 1)
    {
        printf("%d", size);
        return;
    }

    if (n < arr[size / 2])
    {
        int *subset = malloc((size / 2) * sizeof(int));

        for (int j = 0; j < size / 2; j++)
        {
            subset[j] = arr[j];
        }

        binarySearch(subset, n, size / 2);
    }
    else if (n > arr[size / 2])
    {
        int *subset = malloc((size / 2) * sizeof(int));
        int i = 0;
        for (int j = size / 2; j < size; j++)
        {
            subset[i] = arr[j];
            i++;
        }
        binarySearch(subset, n, size / 2);
    }
    else if (n == arr[size / 2])
    {
        printf("%d", size / 2);
        return;
    }
}

int main(int argc, char const *argv[])
{
    int arr[5] = {3, 6, 133, 256, 500};
    int n = 256;
    binarySearch(arr, n, 5);
    return 0;
}

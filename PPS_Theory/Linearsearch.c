# include<stdio.h> 
int main()
{
   	int array[100], search, c, n, i;
 
  	printf("Enter the number of elements in array\n");
   	scanf("%d",&n);
 
   	printf("Enter %d integer(s)\n", n);
 
   	for (i= 0; i < n; i++)
    {
      	scanf("%d", &array[i]);
    }
 
   	printf("Enter the number to search\n");
   	scanf("%d", &search);
 
   	for (i = 0; i < n; i++)
   	{
      		if (array[i] == search)     /* if required element found */
      		{
         			printf("%d is present at location %d.\n", search, i+1);
         			break;
     	 	}
   	}
   	if (i == n)
      	printf("%d is not present in array.\n", search);
 	return 0;
}

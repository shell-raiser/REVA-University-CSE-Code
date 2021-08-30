#include <stdio.h>
int main()
{
     int i = 1;
     for (i = 0; i<=10; i++)
     {
         printf("%d\n", i);
         if (i == 7)
         {
             printf("%d 70 percentage is done and exited\n");
             /* remove break to print till 10 */
             break;                                                        
         }
     }
return 0;
}
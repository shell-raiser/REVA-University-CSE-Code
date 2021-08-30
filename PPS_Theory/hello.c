/*#include <stdio.h>
main ()
{
    printf("hello world");
}*/
#include<stdio.h>
int main(){
	int count = 0, noofno = 0; 
    int j = 0;
	int no[100000];
	//scanf("%d", &noofno);
    fscanf ( stdin , "%d", &noofno);
	
	for (j = 0; j < noofno ; j ++)
    {
    	//scanf("%d", &no[j]);
        fscanf ( stdin , "%d", &no[j]);
       	count = count + no[j];

    }

    fprintf( stdout, "%d\n" ,count );
	return 0;
}

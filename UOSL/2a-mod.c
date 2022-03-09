#include <unistd.h>
# include <stdio.h>
int main(){
	int n1 = fork();
//	printf("%d\n",n1);
	printf("My id is %d\n", n1);
//	printf("dbshjdbs");
	return 0;
/* Write a program to create one parent  using fork() function display its ID using getpid()*/
}

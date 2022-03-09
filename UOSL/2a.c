#include <unistd.h>
# include <stdio.h>
int main(){
	int n1 = fork();
	int n2 = fork();
	if (n1 > 0 && n2 >0){
		printf("Parent\n");
		printf("%d%d\n",n1,n2);
		printf("my id is %d\n", getpid());
		printf("my parentid is %d\n", getpid());
	}
	else if (n1 == 0 && n2 >0){
		printf("Second Child\n");
		printf("%d%d\n",n1,n2);
		printf("my id is %d\n", getpid());
		printf("my parentid is %d\n", getpid());
	}
	else{
		printf("Third Child\n");
		printf("%d%d\n",n1,n2);
		printf("my id is %d\n", getpid());
		printf("my parentid is %d\n", getpid());
	}
	return 0;
/* Write a program to create one parent with three child using fork() function where each process find its ID using getpid()* /
}

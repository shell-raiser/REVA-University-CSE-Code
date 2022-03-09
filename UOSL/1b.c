#include<stdio.h>
#include <stdlib.h>
int main () {
	char c[20];
	printf("Enter Unix Command\n");
	scanf("%s",c);
	system(c);
	return 0;
}

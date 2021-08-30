#include<stdio.h>
#include<string.h>
#define SIZE 20
struct bookdetail
{
char name[20];
char author[20];
int pages;
char *publisher;
float price;
};
void output (struct bookdetail v[],int n);

void main()
{
struct bookdetail b[SIZE];
int n,i;
printf("The Numbers of Books:");
scanf("%d",&n);
printf("\n");
for(i=0;i<n;i++)
{
printf("\t=:Book %d Detail:=\n",i+1);
printf("\nEnter the Book Name:\n");
scanf("%s",b[i].name);
printf("Enter the Author of Book:\n");
scanf("%s",b[i].author);
printf("Enter the Publisher of Book:\n");
scanf("%s",b[i].publisher);
printf("Enter the Price of Book:\n");
scanf("%f",&b[i].price);
}
output(b,n);
}
void output(struct bookdetail v[],int n)
{
int i,t=1;
for(i=0;i<n;i++,t++)
{
printf("\n");
printf("----------------------------------------------------------------\n");
printf("Book No.%d\n",t);
printf("\t\tBook %d Name is %s \n",t,v[i].name);
printf("\t\tBook %d Author is %s \n",t,v[i].author);
printf("\t\tBook %d publisher is %s \n",t,v[i].publisher);
printf("\t\tBook %d Price is %f \n",t,v[i].price);
printf("----------------------------------------------------------------\n");
printf("\n");
}
}

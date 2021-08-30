#include<stdio.h>
#include<stdlib.h>
struct st 
{
char na[20];
char srn[8];
double ma[8];
};
int main()
{
int n,i,j;
printf("Enter the Size: \n");
scanf("%d",&n);
double a[n],t[n];
struct st s[n];
for(i=0;i<n;i++) {
a[i]=0;
t[i]=0; }
printf("Details: \n");
for(i=0;i<n;i++) {
printf("Student %d: \n",i+1);
printf("Name: ");
scanf("%s",&s[i].na);
printf("SRN: ");
scanf("%s",&s[i].srn);
printf("Marks of 8 sub  \n");
for(j=0;j<8;j++) {
scanf("%lf",&s[i].ma[j]); }
for(j=0;j<8;j++) {
t[i]+=s[i].ma[j];
a[i]=t[i]/8; }}
printf("Student Details: \n");
for(i=0;i<n;i++)
{
printf("Student %d:\n",i+1);
printf("Name:%s ",s[i].na);
printf("SRN:%s ",s[i].srn);
printf("Total:%lf ",t[i]);
printf("AVG:%lf\n\n",a[i]);
}
return 0;
}

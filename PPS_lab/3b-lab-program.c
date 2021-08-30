#include<stdio.h>
struct student
{
    struct DOB
    {
        int day;
        int month;
        int year;
    }
    dob;
    char name[20];
}
stud;
int main()
{
char Date[20];
printf("Enter student name\n");
scanf("%s",stud.name);
printf("******Enter DOB******\n");
printf("Enter Day\n");
scanf("%d",&stud.dob.day);
printf("Enter Month\n");
scanf("%d",&stud.dob.month);
printf("Enter year\n");
scanf("%d",&stud.dob.year);
printf("***Details of student***\n");
printf("\nName = %s\n",stud.name);
sprintf(Date,"DOB=%d|%d|%d",stud.dob.day,stud.dob.month,stud.dob.year);
puts(Date);
return 0;
}
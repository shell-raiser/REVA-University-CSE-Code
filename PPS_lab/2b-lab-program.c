#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>
struct airline
{
    char name[50];
    char pan[50];
    char mob[50];
    char email[50];
    char source[50];
    char dest[50];
    char seat_no[10];
    float fare;
} 
air[10];
int main()
{
    int n,i;
    printf("Enter number of records to be added: ");
    scanf("%d",&n);
    for (i=0;i<n;i++)
    {
        printf("\nEnter information for passenger %d ...\n",i+1);
        printf(" Pan : ");
        scanf("%s",air[i].pan);
        printf(" Name : ");
        scanf("%s",air[i].name);
        printf(" Mobile : ");
        scanf("%s",air[i].mob);
        printf(" Email : ");
        scanf("%s",air[i].email);
        printf(" Source : ");
        scanf("%s",air[i].source);
        for(int j=0; j<strlen(air[i].source);j++) 
        {
            tolower(air[i].source[j]);
            j++;
        }
        printf(" Dest : ");
        scanf("%s",air[i].dest);
        for(int j=0; j<strlen(air[i].dest);j++)
        {
            tolower(air[i].dest[j]);
            j++;
        }
        printf(" SeatNo. : ");
        scanf("%s",air[i].seat_no);
        printf(" Fare : ");
        scanf("%f",&air[i].fare);
    }
    for (int i=0;i<n;i++)
    {
        int ress = strcmp(air[i].source,"bengaluru");
        int resd = strcmp(air[i].dest,"london");
        if (ress==0&&resd==0)
        {
            printf("\nDisplaying Information:\n");
            printf(" Name : ");
            printf("%s\n", air[i].name);
            printf(" Pan : ");
            printf("%s\n", air[i].pan);
            printf(" Mob : ");
            printf("%s\n", air[i].mob);
            printf(" Email : ");
            printf("%s\n", air[i].email);
            printf(" Source: ");\
            printf("%s\n", air[i].source);
            printf(" Dest : ");
            printf("%s\n", air[i].dest);
        }
        else
       
            printf ("None of the passengers were travelling from Bangalore to London...\n");
       
    }
 return 0;
}
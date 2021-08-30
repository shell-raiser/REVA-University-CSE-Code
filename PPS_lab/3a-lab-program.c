#include <stdio.h>
#include <string.h>
int main()
{
struct date
{
int day; int month; int year;
};
struct details
{
char name[20];int price;int code;int qty;
struct date mfg;
};
struct details item[50];
int n, i, tot=0;
printf("Number of items: ");scanf ("%d",&n);
for(i=0;i<n;i++)
{
struct details temp;
if(item[i].price>item[i+1].price)
{
temp=item[i];item[i]=item[i+1];item[i+1]=temp;
}
}
for (i = 0; i < n; i++)
{
printf("\nQuantity %d\n\n",i+1);printf("Item name : ");
scanf("%s",&item[i].name);printf(" Item code : ");
scanf("%d",&item[i].code);printf(" Quantity : ");
scanf("%d",&item[i].qty);printf(" price in Rs- : ");
scanf("%d",&item[i].price);tot += (item[i].qty * item[i].price);
printf(" Manufacturing date(dd-mm-yyyy): \n");
scanf(" %d-%d-%d", &item[i].mfg.day, &item[i].mfg.month,&item[i].mfg.year);
}
for(i = 0; i <= n; i++)
{
struct details temp;
if(item[i].price>item[i+1].price)
{
temp=item[i];item[i]=item[i+1];item[i+1]=temp;
}
printf (" *BIG MARKET SHOPPING * \n");
printf (" --------------------------------------------------------------------------------------------------------\n");
printf (" | S.N. | NAME | CODE | QUANTITY | PRICE | MFG.DATE | \n");
printf (" --------------------------------------------------------------------------------------------------------\n");
for (i = 0; i < n; i++)
printf (" %d %-10s %-d %-5d %-9d%d/%d/%d \n", i + 1, item[i].name,
item[i].code, item[i].qty, item[i].price, item[i].mfg.day,
item[i].mfg.month, item[i].mfg.year);
printf (" -------------------------------------------------------------------\n");
printf (" Total Price is : %d \n", tot);
printf (" -------------------------------------------------------------------\n");
printf (" Product with maximum price: %s(%d)\n Product with minimum price: %s(%d)\n",item[n-1].name,item[n-1].price,item[0].name,item[0].price);
printf ("-------------------------------------------------------------------\n");
}
}
#include<stdio.h>
#include<conio.h>
void main()
{
	int a[10],scr,i;
	printf("enter the 10 no in array");
	{
	   for(i=0;i<=10;i++)
	   {
		scanf("%d",&a[i]);
	   }
	    printf("enter no of scr");
	    scanf("%d",& scr);	
	    for(i=0;i<=10;i++)
	    {
		   if(scr==a[i])
	       {   
	
	           printf("found");
	       } 
            getch();
        
		}          
   }
}



#include<stdio.h>
#include<conio.h>
void main()
{
	int a[4],i,sum=0;
	printf("enter your 5 no" );
	for(i=0;i<5;i++)
	{
		scanf("%d",&a[i]);
		sum+=a[i];
	}
printf("sum=%d",sum);
getch();
}
	

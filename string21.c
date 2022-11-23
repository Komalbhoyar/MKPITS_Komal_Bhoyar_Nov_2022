#include<stdio.h>
#include<string.h>
void main()
{
	int len=0,i;
	char name[10];
	printf("enter any name");
	scanf("%s",name);
	for(i=0;name[i]!='\0';i++)
	{
      len=len+1;
	}
	printf("%d",name);

	for(i=len;i>=0;i--)
	{
		printf("%c",name[i]);
	}
		
	
}

#include<stdio.h>
int main()
{
  int num;
  scanf("%d", &num);
  if(num==1)
    printf("One");
  else if(num==2)
    printf("Two");
  else if(num==3)
    printf("Three");
  else if(num==4)
  	printf("Four");
  else if(num==5)
    printf("Five");
  else
    printf("Invalid");
  
  return 0;
}
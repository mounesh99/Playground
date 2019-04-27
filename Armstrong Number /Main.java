#include <stdio.h>
#include <math.h>
int main() {
    int n,sum=0,temp,remainder,digit=0;
  scanf("%d",&n);
  temp=n;
  while(temp!=0)
  {
    digit++;
    temp=temp/10;
  }
  temp=n;
  while(temp!=0)
  {
    remainder=temp%10;
    sum=sum+pow(remainder,digit);
    temp=temp/10;
  }
  if(n==sum)
    printf("Armstrong Number");
  else
           printf("Not an Armstrong Number");
           
	return 0;
}
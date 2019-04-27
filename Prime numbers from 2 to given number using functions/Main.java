#include<stdio.h>
int is_prime(int m);

int main(){
    int m;
  scanf("%d",&m);
  for(int i=2;i<=m;i++)
  {
    if(is_prime(i))
    {
      printf("%d\n",i);
    }
  }
    return 0;
}

int is_prime(int m)
{
  int isprime=1;
  for(int num=2;num<=m/2;num++)
  {
    if(m%num==0)
    {
      isprime=0;
      break;
    }
  }
  return isprime;
}
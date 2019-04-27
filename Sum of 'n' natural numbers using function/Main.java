#include<stdio.h>
int sod(int num);

int main() {
    int n;
  scanf("%d",&n);
  printf("%d",sod(n));
  return 0;
}
int sod(int num)
{
  int sum=0;
  for(int i=1;i<=num;i++)
  {
    sum=sum+i;
  }
  return sum;
}
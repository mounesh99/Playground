#include<stdio.h>
int sqr(int num);
int main() {
   int n;
  scanf("%d",&n);
  printf("%d",sqr(n));
  return 0;

}
int sqr(int num)
{
  int result=num*num;
  return result;
}
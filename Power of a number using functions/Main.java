#include<stdio.h>
int power_of_a_number(int base,int exp);
int main(){
  int base,exp;
  scanf("%d%d",&base,&exp);
  printf("%d",power_of_a_number(base,exp));
  return 0;
}
int power_of_a_number(int base,int exp)
         {
           int power=1;
           while(exp>=1)
           {
             power=power*base;
             exp--;
           }
           return power;
         }
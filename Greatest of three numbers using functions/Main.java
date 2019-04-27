#include <stdio.h>
int greatest_of_2_number(int n1,int n2);

int main(){
	int n1,n2,n3;
  scanf("%d%d%d",&n1,&n2,&n3);
  int greatest=greatest_of_2_number(n1,n2);
  printf("%d",greatest_of_2_number(greatest,n3));
 	return 0;
}
int greatest_of_2_number(int n1,int n2)
{
  int max=0;
  if(n1>n2)
  {
    max=n1;
  }
  else
  {
    max=n2;
  }
//return max;
}
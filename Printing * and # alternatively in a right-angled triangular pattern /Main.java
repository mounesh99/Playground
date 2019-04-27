#include <stdio.h>
int main(){
	int n;
 
  scanf("%d", &n);
   int turn=0;
  for(int i=1;i<=n;i++)
  {
    for(int j=1;j<=i;j++)
    {
      if(turn==0)
      {
        
        printf("*");
       turn=1;
      }
      else
      {
        printf("#");
        turn=0;
      }
    }
    printf("\n");
}
}
#include <stdio.h>
int main(){
  	// Type your code here
  int n,m,i,j;
  scanf("%d %d",&n,&m);
  for(i=1;i<=n;i++)
  {
    for(j=1;j<=i;j++)
    {
      printf("%d",i);
    }
    printf("\n");
  }
	return 0;
}
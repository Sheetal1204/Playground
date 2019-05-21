#include <stdio.h>
int main() {
	//Type your code 
  int n;
  scanf("%d",&n);
  int i,j;
  for(j=1,i=1;j<=n;i=i+2,j++)
  {
      printf("%d",i);
    printf("\n");
  }
	return 0;
}
#include <stdio.h>
int main() {
	//Type your code
  int n,sum=0;
  scanf("%d",&n);
  int i;
  for(i=1;i<=n;i++)
  {
    sum=sum+i;
  }
  printf("%d",sum);
	return 0;
}
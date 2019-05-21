#include<stdio.h>
int main() {
    // Type your code here
  int n,k;
  scanf("%d",&n);
  k=sum(n);
  printf("%d",k);
  	return 0;
}
int sum(int n)
{
  int s,i;
  for(i=1;i<=n;i++)
  {
    s=s+i;
  }
  return s;
}
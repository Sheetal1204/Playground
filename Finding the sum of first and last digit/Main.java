#include <stdio.h>
int main() {
	//Type your code
	
  int n,f,l,sum=0;
  scanf("%d",&n);
  l=n%10;
  f=n;
  while(n>=10)
  {
    n/=10;
  }
  f=n;
  sum=f+l;
  printf("%d",sum);
  return 0;
}
#include <stdio.h>
int main() {
	//Type your code
  int n,f,i,s=0,r;
  scanf("%d",&n);
  int p=n;
  while(n>0)
  {
    r=n%10;
    f=1;
    for(i=r;i>0;i--)
    {
      f=f*i;
      
    }
  s=s+f;
    n=n/10;
  }
  if(s==p)
    printf("Yes");
  else
    printf("No");
  
  return 0;
}
#include <stdio.h>
#include<math.h>
int main() {
	//Type your code
  int n;
  scanf("%d",&n);
  int c=0,p=n,x=n,d,r,s=0;
  while(n>0)
  {
    r=n%10;
    c++;
    n/=10;
  }
  while(p>0)
  {
    d=p%10;
    s=s+pow(d,c);
    p/=10;
  }
  if(s==x)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
     return 0;
}
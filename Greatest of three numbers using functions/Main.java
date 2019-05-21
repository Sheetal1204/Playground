#include <stdio.h>
int main(){
	// Type your code here
  int n1,n2,n3;
  scanf("%d %d %d",&n1,&n2,&n3);
  int k=greatest(n1,n2,n3);
  printf("%d",k);
  	return 0;
}
int greatest(int a,int b,int c)
{
  if(a>b && a>c)
    return a;
  else if(b>a && b>c)
    return b;
  else return c;
}
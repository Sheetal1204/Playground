#include<stdio.h>

   // Type your code here
  int main()
  {
    int n,k;
    scanf("%d",&n);
     k=squ_num(n);
    printf("%d",k);
   return 0;
}
  int squ_num(int a)
  {
   int s=a*a;
    return s;
  }
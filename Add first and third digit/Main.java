#include<stdio.h>
int main()
{
  //Type your code here
  int num,d,r;
  scanf("%d",&num);
  d=num%10;
  r=(num/100);
  printf("%d",(d+r));
  return 0;
}
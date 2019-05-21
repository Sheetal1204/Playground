#include<stdio.h>
int main()
{
  //Type your code here
  int n,i,total;
  int a[50];
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  total = (n + 1) * (n + 2) / 2;  
    for ( i = 0; i< n; i++) {
        total -= a[i]; }
  printf("%d",total);
  return 0;
}
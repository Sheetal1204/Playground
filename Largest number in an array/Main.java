#include<stdio.h>
int main()
{
  //fill the code
  int a[50],i,max,n;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  for(i=0;i<n;i++)
  {
    if(max<a[i])
    {
      max=a[i];
    }
  }
  printf("%d",max);
  return 0;
}
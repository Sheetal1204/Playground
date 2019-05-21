#include<stdio.h>
int main()
{
  //Type your code here
  int a[50],n,i;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  move(a,n);
  for(i=0;i<n;i++)
  {
    printf("%d ",a[i]);
  }
  return 0;
}
 void move(int a[],int n)
{
  int i,k=0;
  for(i=0;i<n;i++)
  
    if(a[i]!=0)
    
      a[k++]=a[i];
      
    
  
  while(k<n)
    a[k++]=0;
}

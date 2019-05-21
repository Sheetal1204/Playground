// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  // Type your code here 
  int n,i,a[50];
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  int k=maximum(a,n);
  printf("%d",k);
  return 0;
}
int maximum(int a[],int n)
{
  int max,i,b;
  for(i=0;i<n;i++)
  {
    if(max<a[i])
    {
      max=a[i];
      b=i;
    }
  }
  return b;
}
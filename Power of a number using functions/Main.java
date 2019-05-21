#include<stdio.h>
int main(){
    // Type your code here
  int x,y;
  scanf("%d %d",&x,&y);
  printf("%d",power(x,y));
        return 0;
}
         int power(int x,int y)
         {
           int k;
           k=pow(x,y);
           return k;
         }
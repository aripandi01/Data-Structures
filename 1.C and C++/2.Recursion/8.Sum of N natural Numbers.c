#include <stdio.h>
#include <stdlib.h>


int getSum(int n)
{
    if(n==0)
        return n;
    return n+getSum(n-1);
}
int main()
{
    int n;
    printf("Enter the number: ");
    scanf("%d",&n);

    printf("%d ",getSum(n));

    return 0;
}

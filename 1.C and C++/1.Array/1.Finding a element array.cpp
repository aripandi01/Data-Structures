#include <iostream>

using namespace std;

int findElement(int arr[], int x, int n)
{
    for(int i=0; i<n; i++)
    {
        if(arr[i] == x)
            return i;
    }

    return -1;
}
int main()
{
    int arr[50] = {20, 35, 44, 7, 52};
    int x = 44;

    cout<<findElement(arr,x,5);
    return 0;
}

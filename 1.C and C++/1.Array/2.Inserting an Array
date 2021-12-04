#include <iostream>
#include<cmath>

using namespace std;

int Insert(int arr[], int x, int pos,int n,int cap)
{
    if(n==cap)
        return n;

    int idx = pos-1;

    for(int i=n; i>idx; i--)
    {
       arr[i] = arr[i-1];
    }
    arr[idx] = x;

    return n+1;
}
int main()
{
    int arr[5] = {10,20,40}, n=3, cap=5;

    cout<<"Before Insertion: \n";
    for(int i=0; i<n; i++)
    {
        cout<<arr[i]<<" ";
    }

    cout<<"\n";

    int pos = 3, x= 30;

    n = Insert(arr,x,pos,n,cap);

    cout<<"After Insertion: \n";
    for(int i=0; i<n; i++)
    {
        cout<<arr[i]<<" ";
    }

    return 0;

}

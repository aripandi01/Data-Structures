#include <iostream>

using namespace std;

int DeleteArray(int arr[], int x, int n)
{
    int i=0;
    for(i=0;i<n;i++)
    {
        if(arr[i] == x)
            break;
    }

    if(i==n)
        return n;

    for(int j=i; j<n-1; j++)
    {
        arr[j] = arr[j+1];
    }

    return n-1;
}
int main()
{
    int arr[] = {10,20,30,40,50}, x = 20, n=5;

    cout<<"Before Deleting: "<<endl;
    for(int i=0; i<n; i++)
    {
        cout<<arr[i]<<" ";
    }

    n = DeleteArray(arr,x,n);

    cout<<"\n";

    cout<<"After Deleting: "<<endl;
    for(int i=0; i<n; i++)
    {
        cout<<arr[i]<<" ";
    }


    return 0;
}

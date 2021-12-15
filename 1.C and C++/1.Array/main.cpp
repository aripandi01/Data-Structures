#include <iostream>

using namespace std;


int RemoveDup(int arr[], int n)
{
    int res=1;

    for(int i=1; i<n; i++)
    {
        if(arr[res-1] != arr[i])
        {
            arr[res] = arr[i];
            res++;
        }
    }

    return res;
}
int main()
{
    int arr[10] = {10,20,20,30,30,30}, n=6;

    cout<<"Before Removing: \n";
    for(int i=0; i<n; i++)
    {
        cout<<arr[i]<<" ";
    }

    cout<<"\n";

    n = RemoveDup(arr,n);

    cout<<"After Removing: \n";

    for(int i=0; i<n; i++)
    {
        cout<<arr[i]<<" ";
    }


    return 0;
}

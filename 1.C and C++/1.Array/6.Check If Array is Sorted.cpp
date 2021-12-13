#include <iostream>

using namespace std;

bool isSorted(int arr[],int n)
{
    for(int i=1; i<n; i++)
    {
        if(arr[i]<arr[i-1])
            return false;
    }

    return true;
}

int main()
{
    int arr[5] = {12, 15, 16, 33, 54};
    int n=5;

    cout<<isSorted(arr,n);


    return 0;
}

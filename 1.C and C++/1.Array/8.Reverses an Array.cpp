#include <iostream>

using namespace std;

void reverseArray(int arr[],int n)
{
    int low = 0, high = n-1;

    while(low<high)
    {
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;

        low++;
        high--;
    }
}
int main()
{
    int arr[5] = {9,8,7,6,5};
    int n=5;

    reverseArray(arr,n);
    cout<<"Reverse array: \n";
    for(int i=0; i<n; i++)
    {
        cout<<arr[i]<<" ";
    }
    return 0;
}

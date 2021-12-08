#include <iostream>

using namespace std;

int largestElement(int arr[], int n)
{
    int res = 0;
    for(int i=1; i<n; i++)
    {
        if(arr[i] > arr[res])
            res = i;
    }

    return res;

}

int main()
{
    int arr[10] = {23,44,55,2,7};
    int n = 5;

    cout<<"The index of largest element is: "<<largestElement(arr,n);

    return 0;
}

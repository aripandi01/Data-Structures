#include <iostream>

using namespace std;

int getSum(int n)
{
  if(n<=9)
        return n;

  return getSum(n/10)+n%10;
}

int main()
{
    int n;
    cout<<"Enter the digit: ";
    cin>>n;

    cout<<"Sum of Digits: "<<getSum(n);
    return 0;
}

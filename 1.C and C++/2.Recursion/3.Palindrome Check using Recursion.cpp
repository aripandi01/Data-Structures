#include <iostream>

using namespace std;

bool isPalindrome(string str,int starting, int ending)
{
    if(starting >= ending)
        return true;

    return((str[starting]==str[ending]) &&
            isPalindrome(str,starting+1,ending-1));
}

int main()
{
    string s;
    cout<<"Enter a String: ";
    getline(cin,s);

    printf("%s", isPalindrome(s, 0, s.length() -1) ? "true" : "false");
    return 0;
}

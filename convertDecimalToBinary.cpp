#include <iostream>
using namespace std;

void convertDecimalToBinary(int n){
    if(n == 0){
        return;
    }
    convertDecimalToBinary(n/2);
    cout << n%2;
}

int main()
{
    int n;
    cout << "Enter a number: ";
    cin >> n;
    convertDecimalToBinary(n);
    return 0;
}
#include <iostream>
using namespace std;

//function to convert a number to binary element using recursion
void convertNumberToBinary(int n){
    if(n == 0){
        return;
    }
    convertNumberToBinary(n/2);
    cout << n%2;
}

int main()
{
    int n;
    cout << "Enter a number: ";
    cin >> n;
    convertNumberToBinary(n);
    return 0;
}
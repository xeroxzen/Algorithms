#include <iostream>
using namespace std;

//function to do a factorial calculation
int factorial(int n){
    if(n == 0){
        return 1;
    }
    return n * factorial(n-1);
}

void printArray(int arr[], int n){
    for(int i = 0; i < n; i++){
        cout << arr[i] << " ";
    }
    cout << endl;
}

int main(){
    //print the output of factorial function
    int arr[] = {12, 11, 13, 5, 6, 7};
    int n = sizeof(arr)/sizeof(arr[0]);
    cout << factorial(n) << endl;
    printArray(arr, n);
    return 0;
}
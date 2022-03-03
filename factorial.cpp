#include <iostream>
using namespace std;

//function to do a factorial calculation
int factorial(int n){
    if(n == 0){
        return 1;
    }
    return n * factorial(n-1);
}

int main(){
    //print the output of factorial function
    cout << factorial(8) << endl;
    return 0;
}
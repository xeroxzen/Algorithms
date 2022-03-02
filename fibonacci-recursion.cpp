#include <iostream>
using namespace std;

int fib(int n){
    //return the nth value of a fibonacci sequence
    if(n == 0){
        return 0;
    }
    if(n == 1){
        return 1;
    }
    return fib(n-1) + fib(n-2);
}

int main(){
    //print the output of fib function
    cout << fib(8) << endl;

}
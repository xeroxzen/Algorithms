#include <iostream>
using namespace std;

//write a function to reverse an array recursively
void reverseArray(int array[], int low, int high){
    if (low < high){
        int temp = array[low];
        array[low] = array[high];
        array[high] = temp;
        reverseArray(array, low+1, high-1);
    }
}

int main(){
    int array[] = {12, 11, 13, 5, 6, 7};
    int n = sizeof(array)/sizeof(array[0]);
    reverseArray(array, 0, n-1);
    for (int i = 0; i < n; i++){
        cout << array[i] << " ";
    }

    return 0;
}
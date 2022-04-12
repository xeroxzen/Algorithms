#include <iostream>
using namespace std;

//Selection Sort Algorithm
void selectionSort(int arr[], int n){
    //loop through the array
    for(int i = 0; i < n-1; i++){
        //set the current index to the first element
        int currentIndex = i;
        //loop through the array again
        for(int j = i+1; j < n; j++){
            //if the current element is greater than the current index
            if(arr[j] < arr[currentIndex]){
                //set the current index to the current element
                currentIndex = j;
            }
        }
        //swap the current index with the first element
        swap(arr[i], arr[currentIndex]);
    }
}

void printArray(int arr[], int n){
    for(int i = 0; i < n; i++){
        cout << arr[i] << " ";
    }
    cout << endl;
}

int main(){
    int arr[] = {12, 11, 13, 5, 6, 7};
    int n = sizeof(arr)/sizeof(arr[0]);
    selectionSort(arr, n);
    printArray(arr, n);
    return 0;
}
// Binary Search in C++

#include <iostream>
using namespace std;

int binarySearch(int array[], int x, int low, int high){
    if(high >= low){
        int mid = low + (high - low) / 2;

        // if found, return it
        if(array[mid] > x)
            return binarySearch(array, x, low, mid - 1);
        // Search the right half
        return binarySearch(array, x, mid + 1, high);
    }

    return -1;
}

int main(void){
    int array[] = {3, 5, 7, 9, 13, 17, 19};
    int x = 13;
    int n = sizeof(array)/sizeof(array[0]);
    int result = binarySearch(array, x, 0, n - 1);
    if(result == -1)
        printf("Not found\n");
    else
        printf("Element is found at index %d\n", result);
}
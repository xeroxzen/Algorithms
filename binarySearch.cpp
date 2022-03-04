#include <iostream>
using namespace std;

// binary search implementation using a function

int binarySearch(int array[], int x,int low, int high){
    // Repeat until the pointers low and high meet each other
    while(low <= high){
        int mid = low + (low - high)/2;

        if (array[mid]==x)
            return mid;

        if (array[mid] < x)
            low = mid+1;

        else
            high = mid-1;
        
        }
        return -1;
}

int main(void){
    int array[] = {12, 11, 13, 5, 6, 7};
    int x = 6;
    int n = sizeof(array)/sizeof(array[0]);
    int result = binarySearch(array, x, 0, n - 1);
    if (result == -1)
        printf("Not found");
    else
        printf("Element is found at index %d", result);
}
#include <iostream>
using namespace std;

int main(){
    int arr[8] = {12, 11, 13, 5, 6, 7, 8, 9};
    
    for(int i = 7; i >= 0; i--){
        cout << arr[i] << " ";
    }
    cout << endl;

    int length = sizeof(arr)/sizeof(arr[0]);
    int average = 0;
    
    for(int i = 0; i < length; i++){
        average += arr[i];
    }
    cout << average/length << " ";
    return 0;
}
#include <iostream>
using namespace std;

//function to do a tower of hanoi
void towerOfHanoi(int n, char source, char destination, char temp){
    //base case
    if(n == 1){
        cout << "Move disk 1 from " << source << " to " << destination << endl;
        return;
    }
    //recursive case
    towerOfHanoi(n-1, source, temp, destination);
    cout << "Move disk " << n << " from " << source << " to " << destination << endl;
    towerOfHanoi(n-1, temp, destination, source);
}

int main(){
    //print the output of tower of hanoi function
    towerOfHanoi(8, 'A', 'C', 'B');
    return 0;
}